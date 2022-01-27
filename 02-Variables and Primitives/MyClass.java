public class MyClass
{
    public static void main(String[] args)
    {
        /** DECLARING VARIABLES:
         * <type> <name> = <expression/value>;
         */
        
        /* Numbers (ints and doubles only) */
        int myInt = 5;
        int myOtherInt = 4;
        System.out.println(myInt + myOtherInt); // outputs 9
        
        double myDouble = -9.8;
        System.out.println(myDouble); // outputs -9.8
        
        /* Booleans */
        boolean myBool = true;
        boolean myOtherBool = 4 == 4;
        boolean someBool = myInt > myOtherInt; // 5 > 4 (see above variables)
        System.out.println(myBool);
        System.out.println(myOtherBool);
        System.out.println(someBool);
        
        /* Chars */
        char myChar = 'a';
        char myOtherChar = 'b';
        System.out.println(myChar);
        System.out.println(myOtherChar);
        
        /* Strings (NOT PRIMITIVES) */
        String myString = "Hello";
        String mySecondString = "World!";
        String beginnings = myString + " " + mySecondString; // string concatenation, will be taught in Episode 4
        System.out.println(myString);
        System.out.println(mySecondString);
        System.out.println(beginnings);
    }
}