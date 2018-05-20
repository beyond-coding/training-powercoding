package com.beyondcoding.trainingpowercoding.designstrategies.dataflow.source;

import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.Energy;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.EnergySource;

public class Sun implements EnergySource {

    @Override
    public Energy getEnergy() {
        return new Energy(new Double(100));
    }
}
