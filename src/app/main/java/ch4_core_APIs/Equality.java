public class Equality {

    // two references equal when they point to the same object of null

    // == compare references pointing to the same object
    // if use == on different types, code won't compile
    // equals() compare objects

    String s1 = "java";
    String s2= "java";
    String s3 = new String("java");
    System.out.println(s1 == s2); //1
    System.out.println(s1 == s3); //2
    System.out.println(s1.equals(s2));//3
    System.out.println(s2.equals(s3)); //4
    // 1, 3, 4 will print true

    public static void main(String[] args) {
        int[] balances1 = new int[2];
        balances1[0] = 10;
        balances1[1] = 20;

        int[] balances2 = balances1;
        balances2[0] = 0;

        System.out.print(balances1 == balances2); // true
    }

    "hello world".equals("hello world")
     "HELLO world".equalsIgnoreCase("hello world")
    "hello".concat(" world").trim().equals("hello world")
        "Hello world".toLowerCase( ).equals("hello world")
}