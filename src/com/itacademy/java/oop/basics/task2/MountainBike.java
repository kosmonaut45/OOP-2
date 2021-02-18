package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

    public MountainBike() {
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (!(Math.abs(newGear) == 1)) {
            System.out.println("Value is not allowed. Please use 1 or -1");
        } else {
            if (gear > 20 || gear < 0) {
                System.out.println("Gear is either over the max 20 or below 0");
            } else {
                gear += newGear;
                System.out.println("New gear is " + gear);
            }
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Increment cannot be a negative number, please use a positive integer.");
        } else {
            if (speed + increment > 100) {
                System.out.println("The pedalling is too intense. Maximum increment is " + (100 - speed));
            } else {
                speed += increment;
                System.out.println("New speed is " + speed);
            }
        }
    }

    @Override
    public void applyBrakes(int decrement) {
        if (decrement < 0) {
            System.out.println("Decrement cannot be a negative number, please use a positive integer.");
        } else {
            if (speed - decrement < -10) {
                System.out.println("The brakes are pressed too hard. Maximum decrement is " + Math.abs(-10 - speed));
            } else {
                speed -= decrement;
                System.out.println("New speed is " + speed);
            }
        }
    }
}
