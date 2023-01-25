package org.fasttrackit.course8.code.abstracted;

public class Dog extends Animal{
    @Override
    public void lives() {

    }

    @Override
    public void breaths() {

    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public void makesSound() {
        super.makesSound();
        System.out.println("Ham ham");
    }
}
