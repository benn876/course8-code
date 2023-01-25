package org.fasttrackit.course8.code;

public class Person {
    private String name;
    private Bike bicycle;

    public Person(String name, Bike bicycle) {
        this.name = name;
        this.bicycle = bicycle;
    }

    public void setBicycle(Bike bicycle) {
        this.bicycle = bicycle;
    }

    public Bike getBicycle() {
        return bicycle;
    }

    public String getName() {
        return name;
    }
}
