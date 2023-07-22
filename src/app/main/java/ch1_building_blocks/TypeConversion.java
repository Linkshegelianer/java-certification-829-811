public class TypeConversion {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        double value1 = 5.5;
        double value2 = 8.3;

        int exp1 = (int) (value1 + value2);
        int exp2 = (int) value1 + (int) value2;
        System.out.println(exp1 == exp2); // true

        // float y = 2.1; // won't compile
        // byte, short & char always promoted when used with a binary arithmetic operator
        // comversion from bigger to smaller must be with excplicit casting
        // compound assignment operator applies casting automatically, cannot be used to declare a new variable

        // int value can be assigned to int, long, float, double
    }

    float:

    float f = -1;
    float f = 0x0123;
    float f = 4;
    float f1 = 1.0; // 1.0 is a double.
    float f = 43e1; // false


    System.out.println(4 + 1.0f); would print 5.0

    Valid:
    long g = 012 ;
    float f = -123 ;

    Invalid:
    float d = 0 * 1.5 ;
    int i = (int) false;

}