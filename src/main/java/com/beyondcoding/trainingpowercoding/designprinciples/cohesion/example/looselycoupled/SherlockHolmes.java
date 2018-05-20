package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled;


public class SherlockHolmes implements Detective {

    private DetectiveSkills detectiveSkills;

    public SherlockHolmes(DetectiveSkills detectiveSkills) {
        this.detectiveSkills = detectiveSkills;
    }

    @Override
    public void investigate(Case theCase) {
        detectiveSkills.useFor(theCase);
    }

}
