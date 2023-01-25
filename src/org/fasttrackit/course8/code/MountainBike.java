package org.fasttrackit.course8.code;

public class MountainBike extends Bike {
    private static final String NAME = "MountainBike";
    private String mountainToClimb;

    public MountainBike(String mountainToClimb, int tyre, String color, String breaksModel) {
        super(tyre, color, breaksModel, NAME);
        System.out.println("Create MountainBike");
        this.mountainToClimb = mountainToClimb;
    }

    public MountainBike(String mountainToClimb, int tyre, String breaksModel) {
        super(tyre, breaksModel, NAME);
        System.out.println("Create MountainBike");
        this.mountainToClimb = mountainToClimb;
    }

    public String getMountainToClimb() {
        return mountainToClimb;
    }

    @Override
    public void howDoesTheBikeSound() {
        System.out.println("sounds like a mountain bike");
    }

    public void cycle() {
        System.out.println("Cycling is going to be fun");
    }

    public void cycle(String cyclist) {
        System.out.println("Cycling is going to be fun for " + cyclist);
    }
}
