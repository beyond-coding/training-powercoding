package com.beyondcoding.trainingpowercoding.designprinciples.solid.dip.example.after;

public class Madeleine {

    private MakeUp makeUp;

    public Madeleine(MakeUp makeUp) {
        this.makeUp = makeUp;
    }

    public void beautify() {
        makeUp.apply();
    }

}
