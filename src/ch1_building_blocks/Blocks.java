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

    // Valid literals:

    int a = 3_1;
    double b = 2_234.0_0;
    int c = 9___6;

    // Invalid literals:
//    int d = 1_329_.0; // _ cannot be before and after .
//    int e = 3_13.0_; // _ cannot be at the end
//    int f = 5_291._2;
//    int g = _1_3_5_0; // _ cannot be at the beginning


    // Text blocks:
//     \ - escaping characters \" -> "
//     \ at the end of the line - omit new line on that line
//     \n - new line for unix
//     \r - new line for mac
//     \s - keep the whitespace (will count for length())

    public static String formatting1 = "\"Java Study Guide\"\n by Scott & Jeanne"; // escape ", \n add new line
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