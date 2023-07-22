/*
Math.random() uses Random.nextDouble(), but Random class allows getting not only double, but also int, long, float,
double, boolean.
 */

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        int x = 10;

        // Correct ways to use Random class:
        Random rand1 = new Random(); // constructor is empty or with initial number (seed)
        int a = rand1.nextInt(x);

        Random rand2 = new Random(x);
        int b = rand2.nextInt(x);

        Random rand3 = new Random(x);
        rand3.setSeed(x);
        int c = rand3.nextInt(x);

        System.out.println(a + " " + b + " " + c);

        // Returning double:
        java.util.Random rand4 = new java.util.Random();
        double d = rand4.nextDouble();

        java.util.Random rand5 = new java.util.Random(100);
        double e = rand5.nextDouble();

        System.out.println(d + " " + e);

        // Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive)
        // both implementations return a random number between 1 and 10
        System.out.println(1 + Math.random() * 9);
        System.out.println(1 + Math.round(Math.random()*9)); // will be rounded

        // Invalid convertion from float to double (must be explicit):
        // float three = Math.random();
    }
}