package building_blocks_1;
/*
Static variables cannot use instance variables
Instance methods can call static, static can call only when creating instance
 */

import java.util.*;

public class TypesOfVariables {

    static class Class {
        // Static or Class variable is shared among all instances of class, will get a default value
        final static int MAX_LENGTH = 5; // final && static -> constant
        int length = 9; // instance variable == class field, will get a default value

        public static int inc(int inches) { // method parameter == local variable
            var newSize = ++inches; // local variable, must be initialized before usage, can be inferred with var
            return newSize;
        }

        // Inferring the type with var (only for local variables):
        public void var() {
            var var0 = 11;
            var var1 = "var";
            var var2 = new Class();
        }

        // Won't compile:
//    int a, var b = 3; // you replaced var with a real type
//    var n = null; // cannot be initialized with null, can only be resigned a null value after it's
//    declared as a reference type
//    var fall = 2, autumn = 2;
//    var winter = 12, cold;
    }

    public static void main(String[] args) {
        var value1 = Class.MAX_LENGTH; // can use it without creating an instance
        Class object = new Class(); // need instance to access fields + class is a reserved word
        var value2 = object.length;
        System.out.println(String.format("Constant variable from Class has value %d, instance variable has value %d.", value1, value2));
        var value3 = 1;
        System.out.println(String.format("Result of static inc() will be %d for %d value.", object.inc(value3), value3)); // 2
    }

    public void count() {
        String a, b, c; // three references
        a = new String("hello");
        b = a; // b points to the same object
        c = a + b; // new object by concatenation
    }

    // The reference type is List and the object type is ArrayList:
    List students = new ArrayList();

}