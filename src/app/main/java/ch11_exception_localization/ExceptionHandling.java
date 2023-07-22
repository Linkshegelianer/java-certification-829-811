public class ExceptionHandling {

    try {
        // protected code
    } catch (Exception e) { // can have multiple catch blocks, subclass exception must go before superclass
        // if one catch block cannot be executed, the whole code won't compile
        // exception handler
    }

    multi-catch block => exceptions mustnt be related

            // finally cannot bo before catch block

    class A
    {
        public void doA(int k) throws Exception {  // 0
            for(int i=0; i< 10; i++) {
                if(i == k) throw new Exception("Index of k is "+i); // 1
            }
        }
        public void doB(boolean f) { //2
            if(f) {
                doA(15); //3
            }
            else return;
        }
        public static void main(String[] args) { //4
            A a = new A();
            a.doB(args.length>0); //5
        }
    }

    public class FinallyTest
    {
        public static void main(String args[]) throws Exception
        {
            try
            {
                m1();
                System.out.println("A");
            }
            finally
            {
                System.out.println("B");
            }
            System.out.println("C");
        }
        public static void m1() throws Exception { throw new Exception(); } // will print B and then throw an Exception
    }

    // no arguments - The end
    // one argument - Exception in Main & The end
    public class FinallyTest
    {
        public static void main(String args[])
        {
            try
            {
                if (args.length == 0) return;
                else throw new Exception("Some Exception");
            }
            catch(Exception e)
            {
                System.out.println("Exception in Main");
            }
            finally
            {
                System.out.println("The end");
            }
        }
    }
}