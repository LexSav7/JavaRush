package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0 && args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();

            BufferedReader fr = new BufferedReader(new FileReader(file));
            String line, last = null;
            while ((line = fr.readLine()) != null) last = line;
            fr.close();

            String id = String.format("%-8d", 1);
            if (last != null) {
                String test = last.split("[^\\d]+")[0];
                if (test.matches("\\d+")) id = String.valueOf(Integer.parseInt(test) + 1);

                if (id.length() > 8) id = id.substring(0, 8);
                else id = String.format("%-8s", id);
            }


            StringBuilder builder = new StringBuilder();
            if (args.length >= 4) {
                for (int i = 1; i < args.length; i++) {
                    builder.append(args[i]).append(" ");
                }
            }
            String params = builder.toString().trim();

            String productName = params.replaceAll("[\\d.]+", "").trim();
//            System.out.println(productName);
            String[] priceAndQty = params.replace(productName, "").trim().split(" ");

            if (productName.length() > 30) productName = productName.substring(0, 30);
            else productName = String.format("%-30s", productName);

            String price = priceAndQty[0];
//            System.out.println(price);
            if (price.matches("\\d+.\\d+")) {
                if (price.length() > 8) price = price.substring(0, 8);
                else price = String.format("%-8s", price);
            }

            String quantity = priceAndQty[1];
//            System.out.println(quantity);
            if (quantity.matches("\\d+")) {
                if (quantity.length() > 4) quantity = quantity.substring(0, 4);
                else quantity = String.format("%-4s", quantity);
            }

            BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
            fw.write(String.format("%n%s%s%s%s", id, productName, price, quantity));
            fw.close();
        }
    }
}
