package com.beyondcoding.trainingpowercoding.designprinciples.solid.dip.example.after;

public abstract class Lipstick {

    private Colour colour;

    public Lipstick(Colour colour) {
        this.colour = colour;
    }

    public void apply() {
        applyOnLips(colour);
    }

    private void applyOnLips(Colour colour) {}

}
