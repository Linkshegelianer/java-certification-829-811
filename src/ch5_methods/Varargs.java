public class Varargs {

    // (int i, int.. j) - can take any number of integers
    // one method can have only one varargs parameter

    public static void main(String... args) { // main() can have varargs as well
        method(1); // length will be 1
        method(1, 2, 3); // length
    }

    static void method(int... input) {
        System.out.println("Number of arguments: " + input.length);
        for (int i : input) {
            System.out.println(i + " ");
        }
    }
}