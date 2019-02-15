package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {

        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());

        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen2.getCountOfEggsPerMonth());
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen3.getCountOfEggsPerMonth());
        System.out.println(hen3.getDescription());

        Hen hen4 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen4.getCountOfEggsPerMonth());
        System.out.println(hen4.getDescription());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if (country.equals(Country.BELARUS)) hen = new BelarusianHen();
            else if (country.equals(Country.MOLDOVA)) hen = new MoldovanHen();
            else if (country.equals(Country.UKRAINE)) hen = new UkrainianHen();
            else hen = new RussianHen();

            return hen;
        }
    }



}
