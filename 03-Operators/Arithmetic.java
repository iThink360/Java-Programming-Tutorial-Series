public class Arithmetic
{
    public static void main(String[] args)
    {
        /* Arithmetic Operators */
        
        // Addition (+)
        int myAddition = 3 + 4;
        System.out.println(myAddition);
        System.out.println(3 + 4);
        
        // Subtraction (-)
        int mySubtraction = 3 - 4;
        System.out.println(mySubtraction);
        System.out.println(3 - 4);
        
        // Multiplication (*)
        int myMultiplication = 3 * 4;
        System.out.println(myMultiplication);
        System.out.println(3 * 4);
        
        // Division (/)
        int myDivision = 4 / 2;
        System.out.println(myDivision);
        System.out.println(4 / 2);
        System.out.println(4 / 3); // whole number result
        System.out.println(4 / 3.0); // decimal result
        System.out.println(4 / 0.0); // "Infinity"
        // System.out.println(4 / 0); --> ERROR!
        
        // Modulus (%)
        int myModulus = 4 % 3;
        System.out.println(myModulus);
        double myOtherMod = 4 % 2.0;
        System.out.println(myOtherMod);
        System.out.println(4 % 0.0);
        
        // Increment and Decrement (++, --);
        int myIncrement = 3;
        System.out.println(myIncrement); // 3
        myIncrement++;
        System.out.println(myIncrement); // 4
        myIncrement--;
        myIncrement--;
        System.out.println(myIncrement); // 2
        double myDouble = 3.14;
        myDouble++;
        System.out.println(myDouble);
    }
}