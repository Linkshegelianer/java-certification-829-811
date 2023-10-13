public class ForLoops {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        // Valid iteration through an array:

        // 1
        System.out.println("Valid 1");
        for (int i = 0; i <= arr.length - 1; ++i) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

        // 2
        System.out.println("Valid 2");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

        // < arr.length - 1 - the last element will be skiped
        // ++i & i++ - no difference
        // <= arr.length - 1 - include last element
        // i <= arr.length -> exception

        //   Invalid for loops:
//   for (int i=5; i=0; i--) { } // the loop condition must be of type boolean, which i=0 is not

//    int j=5;
//    for(int i=0, j+=5;  i<j ; i++) {  j--;  } // j is already declared, using j+=5 is wrong

//        int i, j;
//        for (j=10; i<j; j--) { i += 2; } // i is uninitialized


        // Valid reverse loops:

        System.out.println("Valid reverse 1");
        for (int i = arr.length - 1; i>= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

        System.out.println("Valid reverse 2");
        int q = arr.length;
        for (;;) {
            System.out.print(arr[--q]);
            if (q == 0) break;
        }
        System.out.println(" ");

        System.out.println("Valid reverse 3");
        int x = arr.length - 1;
        for (; x >= 0; x--) {
            System.out.print(arr[x]);
        }
        System.out.println(" ");

        //   Enchanced loops
        //   Using an enhanced for loop prevents the code from going into an infinite loop
        //   You cannot find out the number of the current iteration while iterating

        System.out.println("Enchanced for loop");
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println(" ");

        exampleBreak(); // 2
        exampleContinue(); // 2
        loopTest(); // 5  6
        printZero(); // will print 0 five times
    }

    static void exampleBreak() {
        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
            RABBIT: for(int col = 0; col <3 ; col++) {
                if((col + row) % 2 == 0)
                    break RABBIT; // transfer control to the enclosing statement
                count++;
            }
        System.out.println(count);
    }

    static void exampleContinue() {
        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
            RABBIT: for(int col = 0; col <3 ; col++) {
                if((col + row) % 2 == 0)
                    continue BUNNY; // transfer control to the boolean expression if the loop must continue to the nearest inner loop
                count++;
            }
        System.out.println(count);
    }


    static void loopTest() {
        int i=0, j=11;
        do {
            if (i > j) { break; }
            j--;
        } while (++i < 5); // comparison will happen AFTER increment i because it is ++i and not i++
        System.out.println(i+"  "+j); // will print 5 6
    }

    static void printZero() {
        int array[] = {5, 4, 3, 2, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] - (array.length - i));
        }
    }
}