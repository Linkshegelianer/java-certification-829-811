/*
Boolean methods are taken either from the OCP texbook or freely available trial questions.
The original formatting is preserved.
 */
public class ConditionalStatements {

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 = b1 == false) { // condition will be boolean
            int x;
            System.out.println(x = 3); // expression returns an int
        }

        // while (false) is unreachable -> compile error

        do {
            System.out.println("This code is not unreachable since it's in do/while loop");
        } while (false);

//        ternaryOperator(); // 2, Zebra

        ifTest1(true); // True False
        ifTest1(false); // False False
        ifTest2(true); // 3
        ifTest2(false); // 3
        ifTest3(true); // True True
        ifTest3(false); // True True
        ifTestBig(true); // False True
        ifTestBig(false); // False False
    }

    public static void ternaryOperator() {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;

        int result1 = x> a?(y>b?y:b):(x>z?x:z);
        System.out.println(result1); // 3

        // ternary operator can hold different data types
        int stripes = 2;
        System.out.println((stripes > 5)?21:"Zebra"); // sout will convert to Object and call toString() on them
    }

    static void ifTest1(boolean flag) {
        if (flag)
            if (flag)
                System.out.println("True False"); // if flag is true
        else
            System.out.println("True True"); // will never print this line
        else
            System.out.println("False False"); // if flag is false
    }

    static void ifTest2(boolean flag) {
        if(flag = false){
            System.out.println("1");
        }else if(flag){
            System.out.println("2");
        }else if(!flag){
            System.out.println("3"); // will print 3
        }else System.out.println("4");
    }

    static void ifTestBig(boolean flag) {
        if (flag)   //1
            if (flag)   //2
                if (flag)   //3
                    System.out.println("False True");
                else        //4
                    System.out.println("True False");
            else        //5
                System.out.println("True True");
        else        //6
            System.out.println("False False");
    }

    static void ifTest3(boolean flag) {
        if (true)
            if (false)
                System .out.println("True False");
            else
                System.out.println("True True"); // will print true true
    }

}