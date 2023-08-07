/*
Record is a special type of data-oriented class in which the compiler inserts boilerplate code.

Members automatically added to records:
- constructor with parameters provided in the order they appear in the declaration
- one accessor for each field
- equals()
- hashCode()
- toString()

Records don't have setters since every field is inherently final and records are implicitly final.
Records can implement a regular or sealed interface.
 */
public record Record(int value, String name) {

    // Long constructor (added automatically):
//    public Record(int value, String name) {
//        this.value = value;
//        this.name = name;
//    }

    // Compact constructor:
    public Record { // no parens or constructor parameters
        if (value < 0) throw new IllegalArgumentException(); // custom valudation

        name = name.toUpperCase();
    } // long constructors are called at the end of compact constructor

    // Overloaded constructor:
    public Record(String value1, String value2) {
        this(0, value1 + " " + value2); // this() calls to another constructor
    }

    // What records can include:
    public int getValue() { // instance methods including overriding any provided methods
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("I'm a record!");
    }
    private class Nested {} // nested classes, interfaces, enums and records

    // cannot add instance fields outside the record declaration
    // cannot add instance initializers
}