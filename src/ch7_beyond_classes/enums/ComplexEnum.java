/*
Enum is a fixed set of constants.
Complex enum - has additional elements besides constant values.
- Enum cannot be extended since all enum constructors are implicitly private.
 */
package enums;

public enum ComplexEnum {
    // in complex enums, list of values comes first
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int value;
    private ComplexEnum(int value) {
        this.value = value;
    }
}