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
}