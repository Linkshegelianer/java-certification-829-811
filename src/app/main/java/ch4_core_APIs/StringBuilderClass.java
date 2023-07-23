/*
StringBuilder is a mutable sequence of characters
Most of the methods return a reference to the current object to allow method chaining
StringBuilder class creates a String without storing all interim String values, only StringBuilder() creates object
StringBuffer works the same way, except it supports threads
 */
public class StringBuilderClass {

    public static void main(String[] args) {
        // Creating a StringBuilder:
        StringBuilder sb1 = new StringBuilder(); // create empty sequence of characters and assign sb1 to point to it
        StringBuilder sb2 = new StringBuilder("animal"); // create sb containing a specific value
        StringBuilder sb3 = new StringBuilder(10); // how big the eventual value will be, the sb will reserve this capacity

        // Creating a String using sb & for loop:
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }
        System.out.println(alpha); // abcdefghijklmnopqrstuvwxyz

        // Equality:
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a"); // point to the same object
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }

}