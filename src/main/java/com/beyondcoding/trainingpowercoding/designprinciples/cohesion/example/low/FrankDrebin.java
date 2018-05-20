package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.low;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Case;
import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Detective;
import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.DetectiveSkills;
import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.tightlycoupled.PoliceOfficer;
import com.beyondcoding.trainingpowercoding.designprinciples.solid.isp.example.Suspect;

public class FrankDrebin extends PoliceOfficer implements Detective {

    private DetectiveSkills detectiveSkills;

    private Gun gun;

    private Handcuffs handcuffs;

    public FrankDrebin(DetectiveSkills detectiveSkills, Gun gun, Handcuffs handcuffs) {
        this.detectiveSkills = detectiveSkills;
        this.gun = gun;
        this.handcuffs = handcuffs;
    }

    @Override
    public void investigate(Case theCase) {
        detectiveSkills.useFor(theCase);
    }

    public void shoot(Suspect suspect) {
        gun.shoot(suspect);
    }

    public void arrest(Suspect suspect) {
        handcuffs.restrain(suspect);
    }

}
