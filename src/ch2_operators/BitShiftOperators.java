package operators_2;

public class BitShiftOperators {

    public static void main(String[] args) {

        // << signed left shift
        byte a = 1;
        int i;

        i = a << 2; // from 0001 to 0100 -> from 1 to 4
        System.out.println("Original value of a: " + a);
        System.out.println("Result of left << shift by 2: " + i);

        byte b = 4;
        int k;
        k = b >> 2; // from 0100 to 0001 -> from 4 to 1, fills the leftmost bits with the sign bit
        System.out.println("Original value of b: " + b);
        System.out.println("Result of right shift >> by 2: " + k);

        byte c = -8;
        int j;
        j = c >>> 2; // from -1000 to 0010, filling the leftmost bits with zeros
        System.out.println("Original value of c: " + c);
        System.out.println("Result of unsigned right shift >>> by 2: " + j);

        byte d = 11;
        int h;
        h = d >>> 2; // from 1011 to 0100
        System.out.println("Original value of d: " + d);
        System.out.println("Result of unsigned right shift >>> by 2: " + h);
    }
}
