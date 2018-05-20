package com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy;

public class Energy {

    private Double amount;

    public Energy(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void accumulate(Energy other) {
        amount = amount + other.getAmount();
    }

    @Override
    public String toString() {
        return "Energy(" + amount + ')';
    }
}
