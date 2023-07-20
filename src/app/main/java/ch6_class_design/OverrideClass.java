/*
Same signature, compatible access modifiers, exceptions

Rules vor valud override:
- return type must be covariant == cannot be broader;
- generic arguments must have the same signature with the same generic type.

Overriden method may nod declare any new or broader checked exception that the method it inherits
 */
public class OverrideClass {

    private static class Base {

        public void printMessage() {
            System.out.println("This is the Base class.");
        }

        public int inc(int value) {
            return ++value;
        }
    }

    private static class Subclass extends Base {

        @Override
        public void printMessage() {
            System.out.println("This is the Subclass.");
        }

        @Override
        public int inc(int value) {
            return value++;
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