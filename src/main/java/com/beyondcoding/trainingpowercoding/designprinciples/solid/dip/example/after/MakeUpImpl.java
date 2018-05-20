package com.beyondcoding.trainingpowercoding.designprinciples.solid.dip.example.after;

public class MakeUpImpl implements MakeUp {

    private Lipstick lipstick;

    public MakeUpImpl(Lipstick lipstick) {
        this.lipstick = lipstick;
    }

    @Override
    public void apply() {
        lipstick.apply();
    }

}
