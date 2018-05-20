package com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy;

public abstract class EnergyConsumer {

    private Energy energy = new Energy(new Double(0));

    public EnergyConsumer consume(EnergySource source) {
        Energy digested = digest(source);
        energy.accumulate(digested);
        return this;
    }

    private Energy digest(EnergySource source) {
        double digested = source.getEnergy().getAmount() * getDigestionRatio();
        return new Energy(digested);
    }

    protected abstract double getDigestionRatio();

    public Energy getEnergy() {
        return energy;
    }
}
