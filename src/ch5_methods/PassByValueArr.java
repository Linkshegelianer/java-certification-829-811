/*
Java uses pass by value semantics for passing parameters.

When you pass variable, the value contained in this variable, which is an address to the int array, is copied to
the parameter of the method. Therefore, both passed variable and method parameter point to the same int array object.
You can update the array elements using updateVal().
In each iteration of the foreach loop in updateRed(), the value of an array element is assigned to the loop variable.
Updating the value of the foreach loop variable bal does not change the values in the array pointed to by balances.
 */
public class PassByValueArr {

    public void updateRef(int[] balances) {
        for (int bal : balances) {
            bal = 100;
        }
    }

    public void updateVal(int[] balances) {
        balances[0] = 100;
        balances[1] = 200;
    }

    public static void main(String[] args) {
        int[] balances = new int[2];
        balances[0] = 10;
        balances[1] = 20;

        PassByValueArr p = new PassByValueArr();
        p.updateRef(balances);
        for (int bal : balances) {
            System.out.print(bal + "\n"); // will be 10 20
        }

        p.updateVal(balances);
        for (int bal : balances) {
            System.out.print(bal + "\n"); // will be 100 200
        }
    }
}