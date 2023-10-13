/*
Two references equal when they point to the same object or null.
== compare references pointing to the same object; if use == on different types, code won't compile
equals() uses logical equality rather than object equality
 */
public class Equality {

    public static void main(String[] args) {

        System.out.println("Object equality");
        // == checks whether references point to the same object
        // equals() checks the object itself rather than reference to it
        int[] balances1 = new int[2];
        balances1[0] = 10;
        balances1[1] = 20;

        int[] balances2 = balances1;
        balances2[0] = 0;
        int[] balances3 = new int[1];
        balances3[0] = 5;

        System.out.println(balances1 == balances2); // true, point to the same object
        System.out.println(balances1.equals(balances2)); // true since don't override equals() and works like ==
        System.out.println(balances1.equals(balances3)); // false since different object

        System.out.println("String equality");
        // == checks whether references point to the same String object
        // equals() checks the values inside the String rather than the string reference itself
        System.out.println("hello world".equals("hello world")); // true
        System.out.println("HELLO world".equalsIgnoreCase("hello world")); // true
        System.out.println("hello".concat(" world").trim().equals("hello world")); // true
        System.out.println("Hello world".toLowerCase( ).equals("hello world")); // true

        String s1 = "java";
        String s2 = "java"; // new string is not created, two references to one value in the String pool
        String s3 = new String("java"); // we force JVM to create another String object
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false, different objects
        System.out.println(s1.equals(s2));// true
        System.out.println(s2.equals(s3)); // true

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x == z); // false since z is computed at runtime & new String object is created

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false

        var name = "Hello World";
        var name2 = new String("Hello World").intern(); // will use an object in the string pool if one is present
        System.out.println(name == name2); // true
        System.out.println(name.equals(name2)); // true

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); // true, compile-time constants, share the same string pool reference
        System.out.println(first == second.intern()); // true
        System.out.println(first == third); // false, String constructor => not compile-time constant
        System.out.println(first == third.intern()); // true, point to the same String
    }
}