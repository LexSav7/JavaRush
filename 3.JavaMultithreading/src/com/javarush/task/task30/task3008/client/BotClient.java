package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }
    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }
    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() *100);
    }


    public static void main(String[] args) {
        new BotClient().run();
    }


    public class BotSocketThread extends Client.SocketThread {

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);

            if (message != null && message.contains(": ")) {

                Map<String, SimpleDateFormat> map = new HashMap<>();

                map.put("дата", new SimpleDateFormat("d.MM.YYYY"));
                map.put("день", new SimpleDateFormat("d"));
                map.put("месяц", new SimpleDateFormat("MMMM"));
                map.put("год", new SimpleDateFormat("YYYY"));
                map.put("время", new SimpleDateFormat("H:mm:ss"));
                map.put("час", new SimpleDateFormat("H"));
                map.put("минуты", new SimpleDateFormat("m"));
                map.put("секунды", new SimpleDateFormat("s"));

                String[] data = message.split(": ");
                String answer = String.format("Информация для %s: %s",
                        data[0], map.get(data[1]).format(Calendar.getInstance().getTime()));

                sendTextMessage(answer);
            }

//            if (message != null && !message.isEmpty() && message.contains(": ")) {
//
//                String[] data = message.split(": ");
//
//                SimpleDateFormat date = new SimpleDateFormat("d.MM.YYYY");
//                SimpleDateFormat day = new SimpleDateFormat("d");
//                SimpleDateFormat month = new SimpleDateFormat("MMMM");
//                SimpleDateFormat year = new SimpleDateFormat("YYYY");
//                SimpleDateFormat time = new SimpleDateFormat("H:mm:ss");
//                SimpleDateFormat hour = new SimpleDateFormat("H");
//                SimpleDateFormat minutes = new SimpleDateFormat("m");
//                SimpleDateFormat seconds = new SimpleDateFormat("s");
//
//                switch (data[1]) {
//                    case "дата":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + date.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "день":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + day.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "месяц":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + month.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "год":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + year.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "время":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + time.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "час":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + hour.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "минуты":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + minutes.format(Calendar.getInstance().getTime()));
//                        break;
//
//                    case "секунды":
//                        ConsoleHelper.writeMessage("Информация для " + data[0] + ": "
//                                + seconds.format(Calendar.getInstance().getTime()));
//                        break;
//                }
//            }
        }

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: " +
                            "дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }
    }
}
