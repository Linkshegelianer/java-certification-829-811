import java.util.*;
public class Collections {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<>(); // diamond operator allows omitting the generic type from the right side

        var objectList = new ArrayList<>(); // this will compile and var will be ArrayList<Object>

        // Using predicates with collections:
        Collection<String> list3 = new ArrayList<>();
        list3.add("Magician");
        list3.add("Assistant");
        System.out.println(list3); // [Magician, Assistant]
        list3.removeIf(s -> s.startsWith("A"));
        System.out.println(list3); // [Magician]

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers); // [2, 4, 6]

        // Another example:
        Collection<String> set = new HashSet<>();
        set.add("Wand");
        set.add("");
        set.removeIf(String::isEmpty);
        System.out.println(set); // [Wand]

        // Iterating over the collection:
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println); // 1st option
        cats.forEach(c -> System.out.println(c)); // 2nd option
        Iterator<String> iter = cats.iterator(); // 3rd option
        while(iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        }

        // List interface:

        // Creating List with a Factory:
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array); // [a, b, c] immutable list, exception when adding elements
        List<String> copy = List.copyOf(asList); // [a, b, c] immutable list, exception when adding elements

        System.out.println(list2.add("0")); // true
        System.out.println(list2.remove("1")); // false, "1" wasn't added
        System.out.println(list2.remove(0)); // 0, will remove "0"
        System.out.println(list2.size()); // !!! collections have size(), not length

        // Important implementing classes:
        List<Integer> arrayList = new ArrayList<>(); // resizable array, loop up any element in constant time
        List<Integer> linkedList = new LinkedList<>(); // List + Deque, add/remove in constant time, searching linear time

        // Set interface:

        // Important implementing classes:
        Set<Integer> hashSet = new HashSet<>(); // hash table, arbitrary order, hashCode() for retrieveing Objects efficiently
        Set<Integer> treeSet = new TreeSet<>(); // sorter order, adding/removing is slower than with a HashSet

        // Creating immutable set:
        Set<Character> letters = Set.of('a', 'b', 'c'); // if set contains duplicates, code will throw exception
        Set<Character> copy1 = Set.copyOf(letters);

        // Queue + deque interfaces:

        // Important implementing classes:
        Queue<Integer> linkedList2 = new LinkedList<>(); // LinkedList is also a Deque implementing both List and Deque interfaces
        Deque<Integer> arrayDeque = new ArrayDeque<>(); // use ArrayDeque class if you don’t need List methods

        // Deque methods:
        Deque<Integer> queue2 = new ArrayDeque<>();
        queue2.offerFirst(12);
        queue2.offerLast(14);
        System.out.println(queue2.peekFirst()); // 12
        System.out.println(queue2.peekLast()); // 14
        queue2.pollFirst();
        queue2.pollLast();
        System.out.println(queue2.peekFirst()); // null

        // Map interface (doesn't extend Collection):

        // Important implementing classes:
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>(); // saves the insertion order
        Map<Integer, Integer> treeMap = new TreeMap<>(); // sorts the keys

        // Creating immutable maps:
        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2"); // bad since you need to keep track of which parameter is which
        Map<String, String> map2 = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"));

        // Working with map methods:
        System.out.println(map1.containsKey("key2")); // true
        System.out.println(map1.containsValue("value1")); // true

        // Iterate over a map:
        for (String key: map1.keySet())
            System.out.println(key + ","); // key2, key1

        map1.forEach((k, v) -> System.out.println(v)); // value2, value1

        map1.entrySet().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue())); // key1 value1, key2 value2

        Map<Character, String> map3 = new HashMap<>();
        map3.put('x', "first");

        System.out.println("X marks the " + map3.get('x'));
        System.out.println("X marks the " + map3.getOrDefault('z', ""));

        // Replacing values:
        Map<Integer, Integer> map4 = new HashMap<>();
        map4.put(2, 4);
        Integer original = map4.replace(2, 10); // will return previous value 4
        System.out.println(map4); // {1=2, 2=10} changed value here
        map4.replaceAll((k, v) -> k + v); // calls function on each pair
        System.out.println(map4); // {1=3, 2=12}
    }
}