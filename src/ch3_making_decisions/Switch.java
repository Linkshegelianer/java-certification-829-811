/*
Available types for switch statements/expressions: String, char, byte, short, int, enum.
Every case must be assignable to the type. switch(int) -> all possible values have to be handled.
No two of the case constant expressions associated with a switch statement may have the same value.
case 1: case 2: will result in compile error.
break; is optional, the code will be executed starting with the passing case or default (default can be anywhere in switch)
At most, one default label may be associated with the same switch statement. (It is valid to not have default label at all)
yield == return a value in a switch statement
Empty switch block is a valid construct.
Continue cannot occur in swtich.
 */

public class Switch {

    static void switchExpression(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        }; // here must be a semicolon!!!!
        System.out.println(result);
    }

    static void switchStatement(int number) {
            switch(number) {
                case 1, 2, 3: System.out.print("Winter");
                case 4, 5, 6: System.out.print("Spring");
                default: System.out.print("Unknown");
                case 7, 8, 9: System.out.print("Summer");
                case 10, 11, 12: System.out.println("Fall");
            }
    }

    public static void main(String[] args) {
        switchExpression(1);
        switchStatement(1); // will print all options since no break;
    }
}