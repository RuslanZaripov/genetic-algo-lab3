package lab3;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList<double[]> children = new ArrayList<>();

        // your implementation:
        double[] child1 = new double[p1.length];
        double[] child2 = new double[p2.length];
        for (int j = 0; j < p1.length; j++) {
            double alpha = random.nextDouble();
            child1[j] = alpha * p1[j] + (1 - alpha) * p2[j];
            child2[j] = (1 - alpha) * p1[j] + alpha * p2[j];
        }

        children.add(child1);
        children.add(child2);
        return children;
    }
}
