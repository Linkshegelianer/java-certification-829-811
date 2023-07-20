/*
Static variable cannot use instance variable
Instance methods can call static, static can call only when creating instance
 */

public class TypesOfVariables {

    static class Class {
        // Static or Class variable is shared among all instances of class, will get a default value
        final static int MAX_LENGTH = 5; // final && static -> constant
        int length = 9; // instance variable == class field, will get a default value

        public static int inc(int inches) { // method parameter == local variable
            var newSize = ++inches; // local variable, must be initialized before usage, can be inferred with var
            return newSize;
        }
    }

    public static void main(String[] args) {
        var value1 = Class.MAX_LENGTH; // can use it without creating an instance
        Class object = new Class(); // class is a reserved word, need instance to access fields
        var value2 = object.length;
        System.out.println(String.format("Constant variable from Class has value %d, instance variable has value %d.", value1, value2));
        var value3 = 1;
        System.out.println(String.format("Result of static inc() will be %d for %d value.", object.inc(value3), value3)); // 2
    }
}