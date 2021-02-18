package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(4, 20);
        RoadBike roadBike = new RoadBike(2, 18);

        System.out.println(Speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()));
        mountainBike.speedUp(81);
        roadBike.applyBrakes(-18);
        mountainBike.changeGear(3);
        roadBike.changeGear(100);
        mountainBike.applyBrakes(19);
        roadBike.speedUp(49);
        System.out.println(Speedometer.chooseWinner(mountainBike, roadBike));

    }
}
