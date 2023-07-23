/*
Conversion from bigger to smaller data types must be with excplicit casting.
Casting a numeric value may change the data type, while casting an object only changes the reference to the object,
not the object itself.
 */
public class TypeConversion {

    public static void main(String[] args) {
        // Parse primitive to String:
        int primitive = Integer.parseInt("123");
        Integer wrapper1 = Integer.valueOf("123");

        // Get primitive value of a wrapper instance:
        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue()); // -56
        System.out.println(apple.intValue()); // 200
        System.out.println(apple.doubleValue()); // 200.99

        // Rounding double value:
        double value1 = 5.5;
        double value2 = 8.6;

        int exp1 = (int) (value1 + value2);
        int exp2 = (int) value1 + (int) value2;
        System.out.println(exp1); // 14
        System.out.println(exp2); // 13
        System.out.println(exp1 == exp2); // false

        // byte, short & char always promoted when used with a binary arithmetic operator
        short x = 10;
        short y = 3;
        var z = x * y; // will be promoted to int

        // If one of the values is integral and the other is floating-point,
        // the integral value will be promoted to the floating-point value’s data type
        double result = 1.0 + 2;


        // compound assignment operator applies casting automatically, cannot be used to declare a new variable
        long goat = 10;
        int sheep = 5;
        sheep *= goat; // compiler will cast sheep to a long automatically

        // float data type:
        float f1 = -1;  // int value can be assigned to int, long, float, double
        float f2 = 0x0123;
        float f3 = 4;
        float f4 = -123;
        // float f1 = 1.0; // 1.0 is a double.
        // float f = 43e1; // false
        // float y = 2.1; // won't compile, need f to assign it as a float
        // float d = 0 * 1.5; //
        System.out.println(4 + 1.0f); // would print 5.0

        // valid conversion:
        int fur = (int)5;
        int hair = (short) 2; // int can hold short since it's smaller
        String type = (String) "Bird";
        short tail = (short)(4 + 10);

        // invalid conversion:
//        float egg = 2.0 / 9; // 2.0 is double
//        int tadpole = (int)5 * 2L; // the result will be long
//        short frog = 3 - 2.0; // will be double
//        int fish = 1.0; // assign a double 1.0 to an integer value => int fish = (int)1.0;
//        short bird = 1921222; // outside the range of short
//        int mammal = 9f; // float, not int
//        long reptile = 192_301_398_193_810_323; // doesn’t have L to be treated as long
    }
}