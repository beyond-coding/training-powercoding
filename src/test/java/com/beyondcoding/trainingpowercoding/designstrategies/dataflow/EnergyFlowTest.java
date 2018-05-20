package com.beyondcoding.trainingpowercoding.designstrategies.dataflow;

import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Cow;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Grass;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Human;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.consumer.Tiger;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.EnergyConsumer;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.energy.EnergySource;
import com.beyondcoding.trainingpowercoding.designstrategies.dataflow.source.Sun;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnergyFlowTest {

    private Sun sun;
    private Grass grass;
    private Cow cow;
    private Tiger tiger;
    private Human human;

    @BeforeEach
    void setUp() {
        initialise();
    }

    private void initialise() {
        sun = new Sun();
        grass = new Grass();
        cow = new Cow();
        tiger = new Tiger();
        human = new Human();
    }

    @Test
    void testTraditionalProgramming() {
        assertSunEnergy();

        grass.consume(sun);
        cow.consume(grass);
        tiger.consume(cow);
        human.consume(tiger);

        assertHumanEnergy();
    }

    private void assertSunEnergy() {
        assertEquals(new Double(100), sun.getEnergy().getAmount());
    }

    private void assertHumanEnergy() {
        assertEquals(new Double(23.52), human.getEnergy().getAmount());
    }

    @Test
    void testDataflowConcept() {
        assertSunEnergy();

        EnergySource source = sun;

        source = (EnergySource) grass.consume(source);
        source = (EnergySource) cow.consume(source);
        source = (EnergySource) tiger.consume(source);
        source = (EnergySource) human.consume(source);

        assertHumanEnergy();
    }

    @Test
    void testDataflowStrategyUnfolded() {
        assertSunEnergy();

        human.consume(
                (EnergySource) tiger.consume(
                        (EnergySource) cow.consume(
                                (EnergySource) grass.consume(sun)
                        )
                )
        );

        assertHumanEnergy();
    }

    @Test
    void testDataflowStrategySynthesized() {
        assertSunEnergy();

        List<? extends EnergyConsumer> consumers = Arrays.asList(grass, cow, tiger, human);
        EnergySource source = sun;
        for (EnergyConsumer consumer : consumers) {
            source = (EnergySource) consumer.consume(source);
        }

        assertHumanEnergy();
    }


    @Test
    void testConsumeSun() {
        assertSunEnergy();

        human.consume(sun);

        assertEquals(new Double(70), human.getEnergy().getAmount());
    }
}