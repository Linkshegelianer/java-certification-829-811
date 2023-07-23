# Primitive types

| Keyword     | Type                        | Range                                              | Default value | Example            | Wrapper class inherits Number? | Additional                                                                               |
|-------------|-----------------------------|----------------------------------------------------|---------------|--------------------|--------------------------------|------------------------------------------------------------------------------------------|
| *boolean*   | *true* or *false*           | n/a                                                | *false*       | *true*             | No                             | Is not related to numeric value in Java                                                  |
| *byte*      | 8-bit integral value        | -128 to 127, -2^7 to 2^7 -1                        | 0             | 123                | Yes                            | Upper- and lowercase letters are assignable to byte & will be converted to numeric value |
| *short*     | 16-bit integral value       | -32,768 to 32,767, -2^15 to 2^15 -1                | 0             | 123                | Yes                            |                                                                                          |
| *int*       | 32-bit integral value       | -2,147,483,648 to 2,147,483,647, -2^31 to 2^31 - 1 | 0             | 123                | Yes                            |                                                                                          |
| *long*      | 64-bit integral value       | -2^63 to 2^63 - 1                                  | 0L            | 123L or 123l       | Yes                            |                                                                                          |
| *float*     | 32-bit floating-point value | n/a                                                | 0.0f          | 123.45f            | Yes                            | Requires f in the literal, otherwise number will be double                               |
| *double*    | 64-bit floating-point value | n/a                                                | 0.0           | 123.45             | Yes                            | Double cannot be implicitly narrowed to a float                                          |
| *char*      | 16-bit Unicode value        | 0 to 65,535, 0 - (2^16-1)                          | \u0000        | 'a', '\uDEAF', '\n'| No                             | Char can hold a larger integer value than short                                          |

**Reference type** points to an object by storing the memory address where the object is located.
* All objects are stored in heap.

Assigning a reference:
* to another object of the same or compatible type
* *new* keyword -> assign reference to a new object

**Object** - complex collection of the primitive data types && single value in memory which a reference points to.

**Declaration** - creating a variable without giving it a value.
**Initialization** - giving variable a value.