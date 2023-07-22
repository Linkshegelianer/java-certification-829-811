package building_blocks_1;

public class Blocks {

    // Valid identifiers:

    int normalIdentifier;
    int $normalIdentifier;
    int _normalIdentifier;
    int __normalIdentifier;

    // Invalid identifiers:
//     int 3invalidIdentifier;
//     int invalid@Identifier; // cannot use @ anywhere
//     int *invalidIdentifier; // cannot use * anywhere
//     int java.lang; // periods are not allowed
//     int public; // reserved word
//     int _;

    // Text blocks:
    // \ - escaping characters \" -> "
    // \ at the end of the line - omit new line on that line
    // \n - new line for unix
    // \r - new line for mac
    // \s - two spaces

    public static String formatting1 = "\"Java Study Guide\"\n by Scott & Jeanne";
    public static String formatting2 = """
            "Java Study Guide\"
             by Scott & Jeanne
            """; // everything after """ is just text, including spaces

    public static String formatting3 = """
            "Java Study Guide\"\
             by Scott & Jeanne
            """; // \ omits new line on that line

    // main() method:
    // invalid main() will result in an error at runtime
    // main() must be public static, return void and get String[] (varargs String... will be ok too) as an argument
    // final is allowed to be used for method and/or method parameters
    public final static void main(final String... args) {
//    public final static void main(final String args[]) {
        System.out.println(formatting1);
        System.out.println(formatting2);
        System.out.println(formatting3);
     }
}