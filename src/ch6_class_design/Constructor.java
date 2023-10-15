/*
Constructor is special type of method that creates a new object initializing fields.
Attributes of a constructor: no return type & the name marches the class name.
Contructor with a return type becomes a method.
Private constructor => other classes cannot call it
Constructor cannot be final, static or abstract.
 */
public class Constructor {

    int[] value;

    public Constructor() {
        value = new int[0];
    }

    public Constructor(int... value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            sb.append(value[i]);
            if (i < value.length - 1) {
                sb.append(", ");
            }
        }
        return "[" + sb.toString() + "]";
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(); // Constructor() is called here
        Constructor c2 = new Constructor(1);
        Constructor c3 = new Constructor(1, 2, 3);

        System.out.println(c1.toString()); // []
        System.out.println(c2.toString()); // [1]
        System.out.println(c3.toString()); // [1, 2, 3]
    }

    // All three options will compile:
    private int Constructor;  // we can use the same name for class, variable, or method
    public Constructor(int Constructor){ this.Constructor = Constructor; } // the same name is used, which is not an issue
    public void FooBar(){ } // has return type => method, not a constructor
}