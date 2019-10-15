package edu.gcccd.csis;
import java.util.Random;

public class PI {
    public static double appr(final double runs) {
        final Random random = new Random(System.currentTimeMillis());
        // The "inside" part of the curve
        double inside = 0.0;

        // Return value
        double pi = 0.0;

        for (int i = 1; i <= runs; i++) {

            Double x = random.nextDouble();
            Double y = random.nextDouble();

            // Equation of a circle.  This tells us
            // if the we are inside or outside the circle.
            if ((x*x) + (y*y) <= 1) inside++;

            // Now we determine pi based on the equation
            // pi = (4 * inside) / all.
            pi = 4 * inside / runs;

        }

        return pi;

    }

    public static void main(String []args){

        System.out.println(appr(1e7);

    }

}

