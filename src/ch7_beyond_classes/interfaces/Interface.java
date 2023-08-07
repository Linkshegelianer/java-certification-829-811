/*
Interface is an abstract data type that declares a list of abstract methods that any class implementing the interface
must provide.

- Interfaces cannot be marked final.
- var cannot instantiate an interface.
- If any of the interfaces define abstract methods, then the concrete class is required to override them.
- Interface can extend another interface using the extends keyword. An interface cannot implement another interface.
- In Abstract Classes, both class definition and methods must be marked abstract. In interfaces, it's implicit and
optional.
- Default keyword is only allowed in interfaces.
- All private interface method types are only accessible within the interface declaration.
 */
package interfaces;

public abstract interface Interface { // interfaces are implicitly abstract
    public abstract int getValue(); // interface methods are implicitly abstract && implicitly public if not private

    private String getName() { // interfaces support private methods, but not protected
        return "Name";
    }

    static long getLongValue() { // interfaces support static && private static methods
        return 12L;
    }

    default float getFloatValue() { // default method may be optionally overridden in implementing class
        return 12.0f;
    }

    default char getCharValue() {
        return 'a';
    }

    public static final int MINIMUM_VALUE = 1; // interface variables are implicitly public, static, and final
}

