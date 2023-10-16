/*
Array is a fixed-size area of memory on the heap that has space for primitives or pointers to objects
You specify the size when creating it
Counting begins at 0
last element: arr.length - 1
length, not length()
Methods that are passed varargs (...) can be used as if a normal array was passed in;
In a multidimensional array, the second-level arrays and beyond can be different sizes
 */
import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        // Valid array declarations:
        String[] arr1 = new String[] {"aaa"};
        String[] arr2 = new String[1];
        arr2[0] = "aaa";
        // Adding more elements will result in exception:
//        arr2[1] = "meow";
//        arr2[2] = "nope";
        String[] arr3 = {new String("aaa")};
        String[] arr4 = {"aaa"}; // anonymous array
        // not valid: String[] arr = new String[1]{"aaa"};

        System.out.println(Arrays.toString(arr4)); // to print array in one line, will be [aaa]

        // Casting to another type:
        String[] strArr = { "stringValue" };
        Object[] objArr = strArr;
        String[] againStrArr = (String[]) objArr;

        // Using length attribute:
        int[] array = {1, 2, 3};
        System.out.println(array.length); // 3 since counts all elements in the array, no zero-based indexing

        int[] numbers1 = {6, 9, 1};
        Arrays.sort(numbers1); // 1 6 9
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " "); // will print 1 6 9
        }

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings); // 10, 100, 9
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " "); // will print 10 100 9
        }

        // If the array is already sorted, we can use searching algorithms:
        int[] numbers2 = {2, 4, 6, 8};
        System.out.println("");
        System.out.println(Arrays.binarySearch(numbers2, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers2, 1)); // -1

        int arr[] = {5, 6, 2, 1};
        int arrLength = arr.length;
        ArrayClass mv = new ArrayClass();
        mv.printElements(arr, arrLength);

        // Two-dimensional arrays:
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        String [][] rectangle = new String[3][2]; // has three elements, each has two elements
        int[][] differentSizes = {{1, 4}, {3}, {9,8,7}}; // asymmetric multidimensional array

        // Initialize subarrays separately:
        int [][] asymmetricArr = new int[4][];
        asymmetricArr[0] = new int[5];
        asymmetricArr[1] = new int[3];

        // Looping through multidimensional array:
        var twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " "); // print element
            }
            System.out.println(); // time for a new row
        }

        // via enhanced for-loop:
        for(int[] inner : twoD) {
            for(int num : inner) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void printElements(int arr[], int arrLength) { // will print each element recursively
        if (arrLength != 0) {
            arrLength--;
            printElements(arr, arrLength);
            System.out.println(arr[arrLength]);
        }
    }
}