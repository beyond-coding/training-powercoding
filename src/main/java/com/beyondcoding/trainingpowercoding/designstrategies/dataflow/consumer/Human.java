package com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer;

import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.EnergyConsumer;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.EnergySource;

public class Human extends EnergyConsumer implements EnergySource {

    @Override
    protected double getDigestionRatio() {
        return 0.7;
    }
}
