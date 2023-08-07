/*
Array is a fixed-size area of memory on the heap that has space for primitives or pointers to objects
You specify the size when creating it
Counting begins at 0
last element: arr.length - 1
length, not length()
Methods that are passed varargs (...) can be used as if a normal array was passed in
In a multidimensional array, the second-level arrays and beyond can be different sizes
 */
import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        // Valid array declarations:
        String[] arr1 = new String[] {"aaa"};
        String[] arr2 = new String[1];
        arr2[0] = "aaa";
        String[] arr3 = {new String("aaa")};
        String[] arr4 = {"aaa"}; // anonymous array
        // not valud: String[] arr = new String[1]{"aaa"};

        System.out.println(Arrays.toString(arr4)); // to print array in one line

        // Casting to another type:
        String[] str = { "stringValue" };
        Object[] obj = str;
        String[] againStr = (String[]) obj;

        // Using length attribute:
        int[] array = {1, 2, 3};
        System.out.println(array.length); // 3 since counts all elements in the array, no zero-based indexing

        int[] numbers1 = {6, 9, 1};
        Arrays.sort(numbers1); // 1 6 9
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings); // 10, 100, 9
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        // If the array is already sorted, we can use searching algorithms:
        int[] numbers2 = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers2, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers2, 1)); // -1

    }
}