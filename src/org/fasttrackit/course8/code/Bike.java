package org.fasttrackit.course8.code;

public class Bike {
    private String name;
    private int tyreSpeed;
    private String color;
    private String breaksModel;

    public Bike(int tyreSpeed, String color, String breaksModel, String name) {
        System.out.println("Create Bike");
        this.tyreSpeed = tyreSpeed;
        this.color = color;
        this.breaksModel = breaksModel;
        this.name = name;
    }

    public Bike(int tyreSpeed, String breaksModel, String name) {
        System.out.println("Create Bike");
        this.tyreSpeed = tyreSpeed;
        this.color = "red";
        this.breaksModel = breaksModel;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getTyreSpeed() {
        return tyreSpeed;
    }

    public String getColor() {
        return "The color of your bike is " + color;
    }

    public final void honk() {
        System.out.println("This bike honks trrrrrrr");
    }

    public void howDoesTheBikeSound() {
        System.out.println("sounds fine");
    }
}
