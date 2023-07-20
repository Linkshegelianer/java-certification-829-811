public class StringClass {

    // String.compareTo("hello world") what will be returned

    //String.format() - additional arguments will be ignored, less arguments - exception
    // %s - any type
    // %d - int & long
    // %f - float & double
    // %n - line break

    // str.replace('a', 'x') - will replace all occurences of x

    public static void main(String[] args) {
        String one = "one";
        String two = "two";
        System.out.println(one = two);
    }

    // length(), not length - no zero-bazed counting
    // sublist(1, 1) will return empty sublist
    // sublist(6, 5) will get exception

    // substring(1, 3) - index will stop before 3

    // concat() will return new object
}