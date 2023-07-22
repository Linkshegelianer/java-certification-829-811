public class ForLoops {

    for (int i = 0; i < arr.length; ++i)
        // < arr.length - 1 - пропустит последний элемент
        // ++i & i++ - без разницы
        // <= arr.length - 1 - include last element
        // i <= arr.length => exception

    public static void main(String[] args) {
        // iterate through an array:
        int i = 0; i <= arr.length - 1; ++i/ int i = 0; i < arr.length; i++
                // print in reverse order: int i = arr.length - 1; i>= 0; i--
    }

    // how break; and continue; work
    // break - transfer control to the enclosing statement
    // continue - transfer control to the boolean expression if the loop must continue to the nearest inner loop

    // enchanced for loops don't allow to traverse elements in reversed order & skip elements

    valid reverse loops:
    for (;;) {
        System.out.println(wolf[--q]);
        if (q == 0) break;
    }

    for (int m = wolf.length - 1; m>=0; --m) {

    }

    int x = wolf.length - 1;
    for (int j = 0; x >= 0 && j == 0; x--) {

    }

    public void loopTest() {
        int i=0, j=11;
        do{
            if(i > j) { break; }
            j--;
        }while( ++i < 5); // comparison will happen AFTER increment i because it is ++i and not i++
        System.out.println(i+"  "+j); // will print 5 6
    }


    Valid for loops:
    int i=10;
   for ( ; i>0 ; i--) { }

   for (int i=0, j=10; i<j; i++, --j) {;}

   Invalid for loops:
   for (int i=5; i=0; i--) { } // uses '=' instead of '==' for condition which is invalid. The loop condition must be of type boolean.

    int j=5;
    for(int i=0, j+=5;  i<j ; i++) {  j--;  } // uses 'j +=5'. Now, this statement is preceded by 'int i=0,' and that means we are trying to declare variable j. But it is already declared before the for loop

    int i, j;
   for (j=10; i<j; j--) { i += 2; } // i is uninitialized


    public static void main(String[] args) {

    }

   Enchanced loops:
    - Using an enhanced for loop prevents the code from going into an infinite loop
            - You cannot find out the number of the current iteration while iterating


    Object o = null;
    ArrayList c = //valid ArrayList object.
    int[] ia = //valid array

    for(final Object o2 :c){ }
    for(int i : ia) { }

}