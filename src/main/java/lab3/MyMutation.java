package lab3;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {

    private double clip(double value) {
        double MIN_VALUE = -5.0f;
        double MAX_VALUE = 5.0f;
        return Math.max(MIN_VALUE, Math.min(MAX_VALUE, value));
    }

    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        for (double[] individual : population) {
            for (int i = 0; i < individual.length; i++) {
                individual[i] += random.nextGaussian();
                individual[i] = clip(individual[i]);
            }
        }

        return population;
    }
}
