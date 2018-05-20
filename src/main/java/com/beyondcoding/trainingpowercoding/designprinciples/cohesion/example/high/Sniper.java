package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.high;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.low.Gun;
import com.beyondcoding.trainingpowercoding.designprinciples.solid.isp.example.Suspect;

public class Sniper {

    private Gun gun;

    public Sniper(Gun gun) {
        this.gun = gun;
    }

    public void shoot(Suspect suspect) {
        gun.shoot(suspect);
    }

}
