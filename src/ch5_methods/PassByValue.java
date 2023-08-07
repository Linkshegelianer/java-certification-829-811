/*
This code illustrates how pass-by-value semantics works in Java.

We can change value of a primitive or a object field, but not the reference.
When an object is passed as a parameter, it's actually the value of the reference to the object that is passed.
Modifying the reference itself inside the method does not affect the original reference in the calling code.
 */
public class PassByValue {

    static class Counter {
        private int data;

        public Counter() {
            this.data = data;
        }
    }

    public int updatePrimitive(int value) {
        return value = ++value;
    }

    public void updateValue(Counter counter) {
        counter.data = 1;
    }

    public void updateReference(Counter counter) {
        counter = new Counter(); // assignment only changes the local reference, not the provided reference to object
        counter.data = 3;
    }

    public static void main(String[] args) {
        PassByValue p = new PassByValue();
        int newValue = p.updatePrimitive(1);
        System.out.println(String.format("Updating primitive value from %d to %d.", 1, newValue)); // 1 -> 2

        Counter counter = new Counter();
        System.out.print(String.format("Updating value in Counter object from %d", counter.data));
        p.updateValue(counter);
        System.out.println(String.format(" to %d.", counter.data)); // 0 -> 1

        p.updateReference(counter);
        System.out.println(String.format("Failed reference update %d.", counter.data)); // value will stay 1
    }
}