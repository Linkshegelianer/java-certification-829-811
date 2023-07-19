package operators_2;

public class TypesOfOperators {

    public static void main(String[] args) {
        int value = 3; // Stored as 0011
        int complement = ~value; // Stored as 1100

        System.out.println(String.format("The original value: %d, value after the bitwise complement is %d.", value, complement));

        System.out.println(String.format("Get the bitwise complement manually from %d to %d using formula ~x = x*(-1) - 1", value, (-1 * value - 1))); // -4

        int incPrefix = 1;
        int decrPrefix = 1;
        int incPostfix = 1;
        int decrPostfix = 1;
        System.out.println(String.format("Using pre-increment and pre-decrement operators for %d results in %d and %d.", incPrefix, ++incPrefix, --decrPrefix));
        System.out.println(String.format("Using post-increment and post-decrement operators for %d results in %d and %d.", incPostfix, incPostfix++, decrPostfix--));
        System.out.println(String.format("But then the value will be %d and %d respectively.", incPostfix, decrPostfix));

//        System.out.println(partAttendance);
//        System.out.println(++partAttendance); // increment & output new value
//        System.out.println(partAttendance);
//        System.out.println(partAttendance--); // decrement & output the value before the decrement occurs
//        System.out.println(partAttendance);
//
//        int myFavoriteNumber = 8;
//        int bird = ~myFavoriteNumber; // becomes -9
//        int plane = -myFavoriteNumber; // becomes -8
//        var superman = bird == plane ? 5 : 10; // bird & plane are not the same
//        System.out.println(bird + "," + plane + "," + --superman);
    }
}
