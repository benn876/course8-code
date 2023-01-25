package org.fasttrackit.course8.code;

import org.fasttrackit.course8.code.MountainBike;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("carpati",4,"red","idk2");
        mountainBike.honk();

        Vehicle vehicle = new Vehicle();
        vehicle.honk();

        mountainBike.cycle();
        mountainBike.cycle("Mihai");

        MountainBike redMountainBike = new MountainBike("Alpi",5,"idk1");
        System.out.println(redMountainBike.getColor());
    }
}
