/*
Overloading of a method occurs when the name of more than one methods in a class is exactly same but the parameter type lists are different.
 */
public class Overloading {

    // same name, different parameter list
    // different access modifiers are prohibited
    // possible to overload whith primitive && wrapper type, but cannot be array with different types
    // varargs work the same

    // final methods cannot be overriden or hidden

    // correct overload
    void perform_work(int time){ }
    int  perform_work(int time, int speed){ return time*speed ;}
}