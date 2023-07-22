package operators_2;

public class TypesOfOperators {

    public static void main(String[] args) {
        // Bitwise complement operator:
        int value = 3; // Stored as 0011
        int complement = ~value; // Stored as 1100
        System.out.println(String.format("The original value: %d, value after the bitwise complement is %d.", value, complement));
        System.out.println(String.format("Get the bitwise complement manually from %d to %d using formula ~x = x*(-1) - 1", value, (-1 * value - 1))); // -4


        // % can be applied to floating points values
        // * / % have the same level of precedence

        // Increment & decrement operators:
        // can be applied only on variable, not on expression
        int incPrefix = 1; // increase value, return new value
        int decrPrefix = 1; // decrease value, return new value
        int incPostfix = 1; // increase value, return original value
        int decrPostfix = 1; // decrease value, return original value
        System.out.println(String.format("Using pre-increment and pre-decrement operators for %d results in %d and %d.", incPrefix, ++incPrefix, --decrPrefix));
        System.out.println(String.format("Using post-increment and post-decrement operators for %d results in %d and %d.", incPostfix, incPostfix++, decrPostfix--));
        System.out.println(String.format("But then the value will be %d and %d respectively.", incPostfix, decrPostfix));
    }


    valid declarations:
    int a, b, c; a = b = c = 100;
    int a, b, c=100;
    int a=100, b, c;

    invalid declarations:
    int a = b = c = 100;
    int a= 100 = b = c;
}
