package com.javarush.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }
    public static Car create(int type, int numberOfPassengers) {
        switch (type) {
            case TRUCK:
                return new Truck(numberOfPassengers);
            case SEDAN:
                return new Sedan(numberOfPassengers);
            case CABRIOLET:
                return new Cabriolet(numberOfPassengers);
        }

        return null;
    }

    static protected final int TRUCK = 0;
    static protected final int SEDAN = 1;
    static protected final int CABRIOLET = 2;

    private double fuel;

    private double summerFuelConsumption;
    private double winterFuelConsumption;
    private double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    private boolean isSummer(Date date, Date summerStart, Date summerEnd) {
        return (date.after(summerStart) && date.before(summerEnd));
    }
    private double getWinterConsumption(int length) {
        return length * winterFuelConsumption + winterWarmingUp;
    }
    private double getSummerConsumption(int length) {
        return length * summerFuelConsumption;
    }

    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0) throw new Exception();
        fuel += numberOfLiters;
    }
    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {

        if (isSummer(date, SummerStart, SummerEnd)) return getSummerConsumption(length);
        else return getWinterConsumption(length);
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (canPassengersBeTransferred()) return numberOfPassengers;
        else return 0;
    }
    private boolean canPassengersBeTransferred() {
        return (isDriverAvailable() && (fuel > 0));
    }

    private boolean isDriverAvailable() {
        return driverAvailable;
    }
    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) fastenPassengersBelts();
        fastenDriverBelt();
    }
    public void fastenPassengersBelts() {
    }
    public void fastenDriverBelt() {
    }
    public abstract int getMaxSpeed();
}