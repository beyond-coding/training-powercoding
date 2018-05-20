package com.beyondcoding.trainingpowercoding.designprinciples.solid.dip.example.after;

public class AdvancedMakeUpImpl implements MakeUp {

    private Lipstick lipstick;

    private Eyeliner eyeliner;

    public AdvancedMakeUpImpl(Lipstick lipstick, Eyeliner eyeliner) {
        this.lipstick = lipstick;
        this.eyeliner = eyeliner;
    }

    @Override
    public void apply() {
        lipstick.apply();
        eyeliner.apply();
    }

}
