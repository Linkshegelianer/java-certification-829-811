package sealed_classes;

public non-sealed class Class2 extends SealedClass {

    private class Nested2 extends Class2 {}

    @Override
    public int getValue() {
        return 3;
    }
}