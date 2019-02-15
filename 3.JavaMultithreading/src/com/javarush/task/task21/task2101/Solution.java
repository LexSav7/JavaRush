package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};

        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {

        StringBuilder ipBinary = new StringBuilder();
        StringBuilder maskBinary = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ipBinary.append(Integer.toBinaryString(Byte.toUnsignedInt(ip[i]) + 0x100).substring(1));
            maskBinary.append(Integer.toBinaryString(Byte.toUnsignedInt(mask[i]) + 0x100).substring(1));
//            ipBinary.append(Integer.toBinaryString((ip[i] + 256) % 256));
//            maskBinary.append(Integer.toBinaryString((mask[i] + 256) % 256));
        }

        StringBuilder binary = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            if ((ipBinary.charAt(i-1)=='1') && (maskBinary.charAt(i-1) == '1')) binary.append(1);
            else binary.append(0);
            if (i%8==0) binary.append(' ');
        }

        String[] resultS = binary.toString().split(" ");
        byte[] result = new byte[4];
        for (int i = 0; i < 4; i++) {
            result[i] = (byte) Integer.parseInt(resultS[i], 2);
        }

        return result;
    }

    public static void print(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            result.append(Integer.toBinaryString(Byte.toUnsignedInt(bytes[i]) + 0x100).substring(1) + " ");
        }
        System.out.println(result.toString());
    }
}
