public class ArrayClass {

    // Valid array declarations:

    String[] arr1 = new String[] {"aaa"};
    String[] arr2 = new String[1];
    arr2[0] = "aaa";
    String[] arr3 = {new String("aaa")};
    String[] arr4 = {"aaa"};

    // not valud: String[] arr = new String[1]{"aaa"};

    // length, not length()
    // last element: arr.length - 1
}