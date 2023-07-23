/*
Order of execution:
- fields & instance initializers
- constructors
- methods
 */
public class OrderOfExecution {

    static class Salmon {
        int count;
        {System.out.print(count+"-");} // 2

        {count++;}

        public Salmon() {
            count = 4;
            System.out.print(2+"-"); // 3
        }


    }

    public static void main(String[] args) {
        System.out.print(7+"-"); // 1
        var s = new Salmon();
        System.out.print(s.count+"-"); // 4
    }




}