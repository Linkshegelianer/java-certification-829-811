public class DefaultValues {

    int[] ia = new int[1];
    Object oA[]  = new Object[1];
    boolean bool;
    public static void main(String args[])
    {
        Test test = new Test();
        System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
    }
}