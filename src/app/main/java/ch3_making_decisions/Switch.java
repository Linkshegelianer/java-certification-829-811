public class Switch {

    // switch statements
    // available types: String, char, byte, short, int
    // every case must be assignable to the type
    // to two case can have the same value
    // at most one default statement, if not available - the entire expression will be skipped
    // break; is optional
    // the code will be executed til break
    // empty switch block is a valid construct
    // case 1: case 2: compile error
    // yield == return a value in a switch statement


    All of the following must be true, or a compile-time error will result:
            1.Every case constant expression associated with a switch statement must be assignable to the type of the switch
    Expression. ie. if the switch expression is of type byte then all the case constants must fit in a byte.(e.g. you can't you 200 as a case value)
            2. No two of the case constant expressions associated with a switch statement may have the same value.
            3. At most, one default label may be associated with the same switch statement. (It is valid to not have default label at all.)


    // you can have if/else statements in switch(case) default part


    // switch expressions
    // don't need break;



    // continue cannot occur in swtich

    // switch(int) -> all possible values have to be handled

    public static void main(String args[])
    {
        char i;
        LOOP: for (i=0;i<5;i++)
        {
            switch(i++)
            {
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }
}