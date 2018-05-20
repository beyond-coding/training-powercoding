package com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.java8;


import com.beyondcoding.trainingpowercoding.designprinciples.cohesion.example.looselycoupled.Case;

public interface Detective {

    default void investigate(Case theCase) {
        // stateless implementation within the interface
    }

}
