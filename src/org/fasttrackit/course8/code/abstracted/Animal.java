package org.fasttrackit.course8.code.abstracted;

public abstract class Animal implements Being {
    public abstract int numberOfLegs();
    public void makesSound(){
        System.out.println("Animal sound");
    }
}
