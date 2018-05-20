package com.beyondcoding.trainingpowercoding.designprinciples.solid.isp.example;

public interface Detective {

    void investigate(Case theCase);

    void arrest(Suspect suspect);

    void shoot(Suspect suspect);

}
