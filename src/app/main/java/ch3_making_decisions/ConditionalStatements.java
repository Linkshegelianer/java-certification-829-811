public class ConditionalStatements {

    b1 = false;
    b2 = false;
    if (b2 = b1 == false) // it will be boolean

        if (x = 3) // x is int => expression returns an int

        // while (false) is unreachable => compile error
        // do/while (false) will compile

        do {
            // local variable
    } while (...) // out of the scope !!

        // any code after continue; and break; is unreachable

        // Ternary operator:
        // x> a?(y>b?y:b):(x>z?x:z)
        // ternary operator can hold different data types
        // (stripes > 5)?21:"Zebra"

    int x = 1;
    int y = 2;
    int z = x++;
    int a = --y;
    int b = z--;
    b += ++z;

    int answ = x>a?y>b?y:b:x>z?x:z;
        System.out.println(answ);

        public void ifTest(boolean flag) {
            if (flag)
                if (flag)
                    System.out.println("True False"); // if flag is true
            else
                    System.out.println("True True"); // will never print this line
            else
                System.out.println("False False"); // if flag is false
        }

    public static void main(String[] args) // dangling else problem
    {
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);
    }

    boolean flag = true;
    if(flag = false){
        System.out.println("1");
    }else if(flag){
        System.out.println("2");
    }else if(!flag){
        System.out.println("3"); // will print 3
    }else System.out.println("4");

    public static void main(String args[])
    {
        if (true)
            if (false)
                System .out.println("True False");
            else
                System.out.println("True True"); // will print true true
    }

    public static void ifTest(boolean flag)
    {
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

}