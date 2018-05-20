package com.beyondcoding.trainingpowercoding.designprinciples.solid.isp.example;

public class SherlockHolmes implements Investigator, Shooter {

    @Override
    public void investigate(Case theCase) {}

    @Override
    public void shoot(Suspect suspect) {}

}
