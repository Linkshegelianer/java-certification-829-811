# Exceptions

###   Exceptions hierarchy:
Throwable (checked):
- java.lang.Exception (checked)
  - java.lang.RuntimeException (unchecked)
- Error (unchecked)

### Unchecked exceptions:
| Unchecked Exception            | Description                                                                                                                                                    |    
|--------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ArithmeticException            | Thrown when code attempts to divide by zero.                                                                                                                   |
| ArrayIndexOutOfBoundsException | Thrown when code uses an illegal index to access an array.                                                                                                     |
| ClassCastException             | Thrown when an attempt is made to cast an object to a class of which it is not an instance.                                                                    |
| NullPointerException           | Thrown when there is a null reference where an object is required.                                                                                             |
| IllegalArgumentException       | Thrown by the programmer to indicate that a method has been passed an illegal or inappropriate argument.                                                       |
| NumberFormatException          | Subclass of IllegalArgumentException. Thrown when an attempt is made to convert a String to a numeric type, but the String doesn't have an appropriate format. |

### Checked exceptions:
| Checked Exception        | Description                                                                                                            |
|--------------------------|------------------------------------------------------------------------------------------------------------------------|
| FileNotFoundException    | Subclass of IOException. Thrown programmatically when code tries to reference a file that does not exist.              |
| IOException              | Thrown programmatically when there's a problem reading or writing a file.                                              |
| NotSerializableException | Subclass of IOException. Thrown programmatically when attempting to serialize or deserialize a non-serializable class. |
| ParseException           | Indicates a problem parsing the input.                                                                                 |
| SQLException             | Thrown when an error related to accessing a database occurs.                                                           |

### Error classes:
| Error                       | Description                                                                                                                  |
|-----------------------------|------------------------------------------------------------------------------------------------------------------------------|
| ExceptionInInitializerError | Thrown when static initializer throws exception and doesn’t handle it                                                        |
| StackOverflowError          | Thrown when method calls itself too many times (called infinite recursion because method typically calls itself without end) |
| NoClassDefFoundError        | Thrown when class that code uses is available at compile time but not runtime                                                |
