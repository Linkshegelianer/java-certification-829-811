/*
Rules vor valid override:
- return type must be covariant == cannot be broader; Cannot return void if previously returned something.
- generic arguments must have the same signature with the same generic type.

Overriden method may nod declare any new or broader checked exception that the method it inherits
 */

import java.util.*;

public class OverrideClass {

    private static class Base {

        public void printMessage() {
            System.out.println("This is the Base class.");
        }

        public int inc(int value) {
            return ++value;
        }

        public Number incInt(int value) { return Integer.valueOf(value); } // Number is a superclass for Integer

        public Object returnObj() { // Object is a superclass for every reference type
            List<Integer> list = new ArrayList<Integer>();
            return list;
        }
    }

    private static class Subclass extends Base {

        @Override
        public void printMessage() {
            System.out.println("This is the Subclass.");
        }

        @Override
        public int inc(int value) {
            return ++value;
        }

        @Override
        public Integer incInt(int value) { return Integer.valueOf(++value); }

        @Override
        public List returnObj() {
            List<String> list = new ArrayList<String>();
            return list;
        }
    }

    public static void main(String[] args) {
        Base baseObj = new Base();
        Base subObj = new Subclass();

        baseObj.printMessage(); // Output: This is the Base class.
        subObj.printMessage();  // Output: This is the Subclass.

        System.out.println(baseObj.inc(1)); // 2
        System.out.println(subObj.inc(1)); // 1
    }
}