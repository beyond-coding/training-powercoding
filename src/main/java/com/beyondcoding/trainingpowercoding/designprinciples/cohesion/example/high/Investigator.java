package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.high;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Case;
import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Detective;
import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.DetectiveSkills;

public class Investigator implements Detective {

    private DetectiveSkills detectiveSkills;

    public Investigator(DetectiveSkills detectiveSkills) {
        this.detectiveSkills = detectiveSkills;
    }

    @Override
    public void investigate(Case theCase) {
        detectiveSkills.useFor(theCase);
    }

}
