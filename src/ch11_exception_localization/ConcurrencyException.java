public class ConcurrencyException {

    // Thread.sleep must throw InterruptedException or be wrapped in a try/catch block

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("First thread");
        main1();
    }

    public static void main1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.printf("Exception is caught!");
        }
        System.out.printf("Second thread");
    }
}
