/*
Two classes to generate random numbers in Java: Math and Random
Math.random() uses Random.nextDouble(), but Random class allows getting not only double, but also int, long, float,
double, boolean.
 */
package building_blocks_1;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        int x = 100;

        // Correct ways to use Random class:
        Random rand1 = new Random(); // constructor is empty, seed in the constructor
        int a = rand1.nextInt(x);
        System.out.println(a);

        Random rand2 = new Random(x); // seed can be both in constructor and method
        int b = rand2.nextInt(x);
        System.out.println(b);

        Random rand3 = new Random(x); // seed can be set via separate method
        rand3.setSeed(x);
        int c = rand3.nextInt(x);
        System.out.println(c);

        Random rand4 = new Random(); // seed can be set via separate method without the constructor
        rand4.setSeed(x);
        int d = rand4.nextInt(x);
        System.out.println(d);

        // Returning double:
        java.util.Random rand5 = new java.util.Random();
        double e = rand5.nextDouble();

        java.util.Random rand6 = new java.util.Random(100);
        double f = rand6.nextDouble();

        System.out.println(e + " " + f);

        // Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive)
        // both implementations return a random number between 1 and 10
        System.out.println(1 + Math.random() * 9);
        System.out.println(1 + Math.round(Math.random()*9)); // will be rounded

        // Invalid convertion from float to double (must be explicit):
        // float three = Math.random();
    }
}