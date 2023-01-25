package org.fasttrackit.course8.code;

import org.fasttrackit.course8.code.interfaces.StreetBike;

public class Polymorphism {
    public static void main(String[] args) {
        //polimorfism + instanceof + casting
        Bike bike = new MountainBike("carpati", 4, "idk");
        if (bike instanceof MountainBike) {
            System.out.println(((MountainBike) bike).getMountainToClimb());
        }

        //polimorfism folosind alte clase
        MountainBike mountainBike = new MountainBike("Apli", 3, "idk2");
        StreetBike streetBike = new StreetBike("awesome suspensions", 5, "very good");

        Person person = new Person("Mircea", mountainBike);
        System.out.println(person.getName() + " has a bicycle of type " + person.getBicycle().getName());

        person.setBicycle(streetBike);
        System.out.println(person.getName() + " has a bicycle of type " + person.getBicycle().getName());

    }
}
