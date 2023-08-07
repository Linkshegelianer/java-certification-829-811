/*
- A class can implement an interface, a class cannot extend an interface.
 */
package interfaces;

public class Implementation implements Interface {
    public int getValue() { // public is required, signature matches interface method, return type covariant
            return 1;
        }

    public float getFloatValue() {
        return 13.0f;
    }

    public char getCharValueOld() { // call a hidden default method
        return Interface.super.getCharValue();
    }

    public static void main(String[] args) {
        System.out.println("meow");
    }
}