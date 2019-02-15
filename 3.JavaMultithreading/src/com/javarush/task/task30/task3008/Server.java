package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage(e.getMessage());
            }
        }
    }


    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server is running ...");

            while (true) {
                new Handler(serverSocket.accept()).start();
            }

        } catch (IOException e) {
            ConsoleHelper.writeMessage(e.getMessage());
        }

    }


    private static class Handler extends Thread {

        public Handler(Socket socket) {
            this.socket = socket;
        }
        private Socket socket;

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message response = connection.receive();

                if ((response.getType() == MessageType.USER_NAME)
                        && (!(response.getData().isEmpty()))
                        && (!(connectionMap.containsKey(response.getData())))) {

                    connectionMap.put(response.getData(), connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return response.getData();
                }
            }
        }
        private void sendListOfUsers(Connection connection, String userName) throws IOException {

            for (String data : connectionMap.keySet()) {
                if (!(data.equals(userName))) {
                    connection.send(new Message(MessageType.USER_ADDED, data));
                }
            }
        }
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {

            while (true) {
                Message message = connection.receive();

                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Error has occured!");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Connected with address " + socket.getRemoteSocketAddress());
            String userName = null;

            try (Connection connection = new Connection(socket)) {

                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (ClassNotFoundException | IOException e) {
                ConsoleHelper.writeMessage(e.getMessage());

            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }

                ConsoleHelper.writeMessage("The connection has been closed.");
            }


        }
    }

}
