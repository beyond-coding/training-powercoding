package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.tightlycoupled.PoliceOfficer;

public class KateBeckett extends PoliceOfficer implements Detective {

    private DetectiveSkills detectiveSkills;

    public KateBeckett(DetectiveSkills detectiveSkills) {
        this.detectiveSkills = detectiveSkills;
    }

    @Override
    public void investigate(Case theCase) {
        detectiveSkills.useFor(theCase);
    }

}
