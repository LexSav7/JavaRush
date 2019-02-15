package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException{
        if (args != null) {

            String file = null;
            try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                file = reader.readLine();
            }

            //writing all lines of the file to the Array List
            List<String> list = new ArrayList<>();
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) {
                    list.add(reader.readLine());
                }
            }

            if (args[0].equals("-u") || args[0].equals("-d")) {
                if (args[0].equals("-u") && args.length >= 5) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).contains(args[1])) {
                            //searching for the required id
                            if (list.get(i).substring(0,8).trim().equals(args[1])) {
                                // Checking if the given arguments are valid before assigning to the variables
                                String id = "";
                                if (args[1].matches("\\d+")) id = args[1];

                                String price = "";
                                if (args[args.length-2].matches("\\d+.\\d+"))
                                    price = args[args.length-2];

                                String quantity = "";
                                if (args[args.length-1].matches("\\d+"))
                                    quantity = args[args.length-1];

                                String productName = "";
                                if (args.length > 5) {
                                    StringBuilder builder = new StringBuilder();
                                    for (int j = 2; j < args.length-2; j++) {
                                        builder.append(args[j]).append(" ");
                                    }
                                    productName = builder.toString().trim();
                                } else productName = args[2];

                                //cut the values to the required sizes
                                if (id.length() > 8) id = id.substring(0,8);
                                if (productName.length() > 30) productName = productName.substring(0,30);
                                if (price.length() > 8) price = price.substring(0,8);
                                if (quantity.length() > 4) quantity  = quantity.substring(0,4);

                                //adding right padding to the parameters
                                //if they are less than the required sizes
                                list.set(i, String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity));
                            }
                        }
                    }
                }

                if (args[0].equals("-d") && args.length == 2) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).contains(args[1])) {
                            if (list.get(i).substring(0,8).trim().equals(args[1])) {
                                list.remove(i);
                            }
                        }
                    }
                }

                //re-writing the file with the edited content
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (String x : list) {
                        writer.write(x);
                        writer.newLine();
                    }
                }
            }
        }
    }
}
