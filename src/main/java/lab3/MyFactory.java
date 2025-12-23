package lab3;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private final int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        // x from -5.0 to 5.0
        double MIN_VALUE = -5.0f;
        double MAX_VALUE = 5.0f;

        // your implementation:
        for (int i = 0; i < dimension; i++) {
            solution[i] = MIN_VALUE + random.nextFloat() * (MAX_VALUE - MIN_VALUE);
        }

        return solution;
    }
}

