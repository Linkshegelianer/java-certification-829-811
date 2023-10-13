/*
    try {
        // protected code
    } catch (Exception e) { // can have multiple catch blocks, subclass exception must go before superclass
        // if one catch block cannot be executed, the whole code won't compile
        // exception handler
    }

Multi-catch block => exceptions must not be related.
Finally cannot bo before catch block.
 */
public class ExceptionHandling {

    // no arguments - The end
    // one argument - Exception in Main & The end

    public static void main(String args[]) {
        try {
            if (args.length == 0) return;
            else throw new Exception("Some Exception");
        } catch(Exception e) {
            System.out.println("Exception in Main");
        } finally {
            System.out.println("The end");
        }
    }

    class FinallyTest {
        public static void main(String args[]) throws Exception {
            try {
                m1();
                System.out.println("A");
            } finally {
                System.out.println("B");
            }
            System.out.println("C");
        }
        public static void m1() throws Exception { throw new Exception(); } // will print B and then throw an Exception
    }

}