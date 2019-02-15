package com.javarush.task.task25.task2513;

import java.util.Random;

/* 
Обеспечение отсутствия прерывания важной операции
*/
public class Solution {
    private static final Integer THRESHOLD_VALUE = 500;
    private static final Random RANDOM = new Random();

    public synchronized void moveMoney(Account from, Account to, int amount) {
//        if(amount > THRESHOLD_VALUE)
        from.setBalance(from.getBalance() - amount);
//        System.out.println(Thread.currentThread().getName());
        if(RANDOM.nextInt(600) > THRESHOLD_VALUE) Thread.yield();
//        System.out.println(Thread.currentThread().getName());
        to.setBalance(to.getBalance() + amount);
    }

    class Account {
        private int balance;

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Solution bank = new Solution();
        Account firstAccount = bank.new Account();
        Account secondAccount = bank.new Account();

        firstAccount.setBalance(1000);
        secondAccount.setBalance(1000);
        bank.moveMoney(firstAccount, secondAccount, 500);

        System.out.println(firstAccount.getBalance());
        System.out.println(secondAccount.getBalance());
    }
}
