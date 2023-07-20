import java.util.*;
public class Collections {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>(); // diamond operator allows omitting the generic type from the right side

        // TODO:
        // List, Map, Set, Queue class methods
        // Comparator sorts in ascending order, reversed() in descending
        // Iterate over map, containsKey() containsValue()


        // Creating List with a Factory:
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array); // [a, b, c] immutable list, exception when adding elements
        List<String> copy = List.copyOf(asList); // [a, b, c] immutable list, exception when adding elements

        var objectList = new ArrayList<>(); // this will compile and var will be ArrayList<Object>

        Deque<Integer> queue1 = new ArrayDeque<>();
        queue1.offerFirst(12);
        queue1.offerLast(14);
        System.out.println(queue1.peekFirst()); // 12
        System.out.println(queue1.peekLast()); // 14
        queue1.pollFirst();
        queue1.pollLast();
        System.out.println(queue1.peekFirst()); // null

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers); // [2, 4, 6]

    }
}