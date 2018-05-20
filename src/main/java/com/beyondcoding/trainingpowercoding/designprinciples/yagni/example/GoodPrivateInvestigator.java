package com.beyondcoding.trainingpowercoding.designprinciples.yagni.example;

import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Case;

public class GoodPrivateInvestigator {

    public void solve(Case theCase) {
        documentEverythingAbout(theCase);
        createTimelineOf(theCase);
        followEveryLeadOf(theCase);
        // arrestTheKillerOf(theCase);
    }

    private void documentEverythingAbout(Case theCase) {
    }

    private void createTimelineOf(Case theCase) {
    }

    private void followEveryLeadOf(Case theCase) {
    }

}
