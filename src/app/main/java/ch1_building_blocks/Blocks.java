package building_blocks_1;

public class Blocks {

    // Attributes of a constructor: no return type & the name marches the class name
    public Blocks() {}

    public Blocks(int length) {
        this.length = length;
    }

    // Types of variables:
    final static int MAX_LENGTH = 5; // class variable
    int length = 9; // instance variable == class field

    public void grow(int inches) { // local variable
        if (length < MAX_LENGTH) {
            int newSize = length + inches; // local variable
            length = newSize;
        }
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


    // Objects vs. references:
    // Reference is a variable that has a name and can be used to access the contents of an object
    // Object sits on the heap and does not have a name, get's garbage collected when its state is no longer accessible
    public static void scope() {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; // no pointer to "a"
        String three = one; // new pointer to "b"
        one = null; // two pointers to "b"
    }

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

    // Valid formats of a variable name:
//     public final static void main(final String[] args) {
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