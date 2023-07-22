public class Constructor {

    // private constructor => other classes cannot call it
    // Attributes of a constructor: no return type & the name marches the class name
    // Contructor with a return type becomes a method

    // this - instance of the class
    // this() - constructor call within a class, should be the first statement in a constructor


    // constructor cannot be final, static or abstract


    // 1 and 4 cannot occur in the same class - int a is not static
    // 1 and 2 cannot occur in the same class - they have the same name
    int a;    //  (1)
    static int a;    //  (2)
    int f( )   { return a; }    //  (3)
    static int f( ) { return a; }    //  (4)
}