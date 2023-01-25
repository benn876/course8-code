package org.fasttrackit.course8.code.interfaces;

import org.fasttrackit.course8.code.Bike;

public class StreetBike extends Bike {
    private static final String NAME = "StreetBike";
    private final String suspension;

    public StreetBike(String suspension, int tyreSpeed, String breaksModel) {
        super(tyreSpeed, breaksModel, NAME);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }
}
