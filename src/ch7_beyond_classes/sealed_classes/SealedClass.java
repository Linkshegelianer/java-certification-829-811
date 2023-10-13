/*
A sealed class is a class that restricts which other classes may directly extend it.
- permits: Used with the sealed keyword to list the classes and interfaces allowed.
- non-sealed: Applied to a class or interface that extends a sealed class, indicating that
it can be extended by unspecified classes.
- Every extending class must be final, sealed or non-sealed.
- Sealed interfaces work the same way, but cannot be marked final.
- Sealed classes must be in the same package or named module as their direct subclasses.
 */
package sealed_classes;

public sealed class SealedClass permits SealedClass.Nested, Class1, Class2 {
    final class Nested extends SealedClass {
    }

    public int getValue() {
        return 0;
    }
}