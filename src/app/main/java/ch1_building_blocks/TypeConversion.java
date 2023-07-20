public class TypeConversion {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        double value1 = 5.5;
        double value2 = 8.3;

        int exp1 = (int) (value1 + value2);
        int exp2 = (int) value1 + (int) value2;
        System.out.println(exp1 == exp2); // true

    }

}