package com.beyondcoding.trainingpowercoding.designstrategies.dataflow;

import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Cow;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Grass;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Human;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Tiger;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.source.Sun;

public class EnergyFlow {

    public static void main(String[] args) {
        Sun sun = new Sun();
        Grass grass = new Grass();
        Cow cow = new Cow();
        Tiger tiger = new Tiger();
        Human human = new Human();

        System.out.println("The sun produces: " + sun.getEnergy());

        grass.consume(sun);
        cow.consume(grass);
        tiger.consume(cow);
        human.consume(tiger);

        System.out.println("The human received: " + human.getEnergy());
    }

}
