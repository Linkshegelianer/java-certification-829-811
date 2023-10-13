/*
Overloading of a method occurs when the name of more than one method in a class is exactly same
but the parameter type lists are different.
Different access modifiers are prohibited
Possible to overload with primitive && wrapper type, but cannot has array with different types
Final methods cannot be overriden or hidden
 */
public class Overloading {

    // correct overload
    public static void main(String[] args) {
        perform_work(2);
        System.out.println(perform_work(2, 4));
    }

    static void perform_work(int time){ }
    static int perform_work(int time, int speed){ return time*speed ;}
}