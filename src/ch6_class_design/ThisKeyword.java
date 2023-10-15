/*

 */
public class ThisKeyword {

    int i1;
    static int i2;
    public void method1()
    {
        int i;

        // Possible statements here:
        i = this.i1; // As i1 is an instance variable, it is accessible through 'this'

        i = this.i2; // Although 'this' is not needed to access i2, it is not an error to do so

        this.i1 = i2;

        // Prohibited options:

//        this.i = 4; // cannot do 'this.i' as 'i' is a local variable
//        this = new Test(); // cannot change 'this'
    }
}
