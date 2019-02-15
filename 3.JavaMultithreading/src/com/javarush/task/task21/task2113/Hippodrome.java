package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (Horse x : horses) {
            x.move();
        }
    }

    public void print() {
        for (Horse x : horses) {
            x.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        int longest = (int) getHorses().get(0).getDistance();
        Horse winner = null;
        for (Horse x : getHorses()) {
            if ((int) x.getDistance() > longest) {
                longest = (int) x.getDistance();
                winner = x;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().name + "!");
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("first", 3, 0));
        game.getHorses().add(new Horse("second", 3, 0));
        game.getHorses().add(new Horse("third", 3, 0));

        game.run();
        game.printWinner();
    }
}
