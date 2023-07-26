/*
Order of initializing instances (objects):
1. Initialize class if it has not been previously initialized.
2. If there is a superclass, then initialize the instance of it first.
3. Process all instance variable declarations in the order in which they appear in the class.
4. Process all instance initializers in the order in which they appear in the class.
5. Initialize the constructor, including any overloaded constructors referenced with this().
6. Initialize other methods.
 */
public class OrderOfExecution {
    static { System.out.println("Superclass, static initializer block"); } // 1
    { System.out.println("Superclass, instance initializer"); } // 3, 8, 13

    public OrderOfExecution(String name) { // 5, 10
        this(1);
        System.out.println("Superclass, constructor with one String argument");
    }

    public OrderOfExecution() { // 14
        System.out.println("Superclass, no-agrument constructor");
    }

    public OrderOfExecution(int stripes) { // 4, 9
        System.out.println("Superclass, constructor with one int argument");
    }

    public static void main(String[] grass) {
        new Subclass(1);
        new Subclass(2);
        new Subclass();
    }
}

class Subclass extends OrderOfExecution {
    static { System.out.println("Subclass, static initializer block"); } // 2
    { System.out.println("Subclass, instance initializer"); } // 6, 11, 15

    public Subclass(int input) { // 7, 12
        super("");
        System.out.println("Subclass, constructor with one int argument");
    }

    public Subclass() { // 16
        super();
        System.out.println("Subclass, no-agrument constructor");
    }
}


