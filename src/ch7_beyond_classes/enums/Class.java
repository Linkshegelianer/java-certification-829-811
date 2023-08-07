package enums;

public class Class {

    public static void main(String[] args) {
        var s = SimpleEnum.SUMMER;
        System.out.println(s);

        // Methods provided by Enum:
        for (var season : SimpleEnum.values()) { // return an array of all enum values
            System.out.println(season.name() + " " + season.ordinal()); // returns corresponding int value
        }

        SimpleEnum season = SimpleEnum.valueOf("SUMMER"); // retrieve an enum value from a String

        // Using enums in switch statements:

        var d = ComplexEnum.MONDAY;

        switch(d) {
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            default:
                System.out.println("It's Wednesday or some other day of the week!");
        }

        var t = EnumMethods.DAY;
        System.out.println(t);
    }
}