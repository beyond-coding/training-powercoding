package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.high;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.low.Handcuffs;
import com.beyondcoding.trainingpowercoding.designprinciples.solid.isp.example.Suspect;

public class Warden {

    private Handcuffs handcuffs;

    public Warden(Handcuffs handcuffs) {
        this.handcuffs = handcuffs;
    }

    public void arrest(Suspect suspect) {
        handcuffs.restrain(suspect);
    }

}
