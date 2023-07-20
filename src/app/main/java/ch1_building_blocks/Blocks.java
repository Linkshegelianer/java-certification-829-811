package building_blocks_1;

public class Blocks {

    // Attributes of a constructor: no return type & the name marches the class name
    // Contructor with a return type becomes a method
    public Blocks() {}

    public Blocks(int length) {
        this.length = length;
    }



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

    // Inferring the Type with var:
    public void var() {
        var var0 = 11;
        var var1 = "var";
        var var2 = new Blocks();
    }

    // Won't compile:
//    int a, var b = 3; // you replaced var with a real type
//    var n = null; // cannot be initialized with null, can only be resigned a null value after it's declared as a reference type
//    var fall = 2, autumn = 2;
//    var winter = 12, cold;


    // scientific notation 43e1

    // chained initialization is not valid:
    /// int a = b = c = 100; faul
    // int a, b, c = 100; a and b are not initialized

    // Text blocks:
    public static String formatting1 = "\"Java Study Guide\"\n by Scott & Jeanne";
    public static String formatting2 = """
            "Java Study Guide\"
             by Scott & Jeanne
            """; // everything after """ is just text, including spaces

    public static String formatting3 = """
            "Java Study Guide\"\
             by Scott & Jeanne
            """; // \ omits new line on that line
//     public final static void main(final String[] args) {
    // invalid main() will result in an error at runtime
    public final static void main(final String... args) {
//    public final static void main(final String args[]) {
        Blocks blocks = new Blocks();
        blocks.length = 10;
        System.out.println(blocks.length);
        System.out.println(formatting1);
        System.out.println(formatting2);
        System.out.println(formatting3);
     }
}