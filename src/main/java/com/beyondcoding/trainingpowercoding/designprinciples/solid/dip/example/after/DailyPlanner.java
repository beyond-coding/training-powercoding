package com.beyondcoding.trainingpowercoding.designprinciples.solid.dip.example.after;

public class DailyPlanner {

    public void planToday() {
        RedLipstick lipstick = new RedLipstick();
        MakeUpImpl makeUp = new MakeUpImpl(lipstick);
        Madeleine madeleine = new Madeleine(makeUp);
        madeleine.beautify();
    }

    public void planTomorrow() {
        RedLipstick lipstick = new RedLipstick();
        Eyeliner eyeliner = new BlackEyeliner();
        AdvancedMakeUpImpl makeUp = new AdvancedMakeUpImpl(lipstick, eyeliner);
        Madeleine madeleine = new Madeleine(makeUp);
        madeleine.beautify();
    }

}
