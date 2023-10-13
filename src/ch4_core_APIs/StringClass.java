/*
String is an immutable sequence of characters.
Calling the constructor explicitly is optional
Concatenation operator (+) creates a new String with the content of the first and second String
If either operand involved in the + expression is a String, concatenation is used. Otherwise, addition is used
String literals are stored in the string pool
 */
public class StringClass {
    public static void main(String[] args) {
        String str1 = new String(" ");
        System.out.println(str1.length()); // length for arrays, length() for strings, will be 1

        // String.format() - additional arguments will be ignored, fewer arguments - exception
//         %s - any type
//         %d - int & long
//         %f - float & double
//         %n - line break

        System.out.println(String.format("Formatting strings with %s, %d, %f and a new line: %n.", 12, 12L, 12.0));

        // str.replace('a', 'x') - will replace all occurrences of x
        String str = "asdfasdfasdasd";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        if (ch1 == 'a') str = str.replace('a', 'x');
        if (ch2 == 's') str = str.replace('s', 'x');
        System.out.println(str);

        System.out.println(str.substring(1, 1)); // will return empty sublist
        System.out.println(str.substring(1, 3));// substring(1, 3) - index will stop before 3 !!!
        // sublist(6, 5) will get exception

        char ch3 = str.charAt('\n'); // char will be implicitly promoted to int
        System.out.println(ch3); // will print d

        String one = "one";
        String two = "two";
        System.out.println(one = two); // will print two

        String abc = "";
        abc.concat("abc"); // will return a new object, but there's no reference to it
        abc.concat("def");
        System.out.println(abc); // string is immutable, empty string will be printed !!!
    }
}