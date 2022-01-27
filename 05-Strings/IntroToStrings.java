// A review of declaring some Strings, alongside examining memory allocation.

public class IntroToStrings
{
    public static void main(String[] args)
    {
        /* String Variables vs. String Literals */
        String greetings = "Hello World!";
        System.out.println(greetings); // Printing a String Variable
        System.out.println("Hello World!"); // Printing a String Literal
        
        /* Numbers in Strings? */
        int myNum = 5;
        String myString = "5"; // NOT eligible for calculations!
        
        /* Memory Allocation */
        
        // Same Allocation for Alike Primitive Types, Regardless of Data Held
        int someNum = 3;
        int someOtherNum = 3333333;
        
        // Different Allocation for Object Instances, Depending on Data Held
        String hi = "Hi!";
        String hiAgain = "Hello!";
        
        // In this case, bytes still take up less bits of memory storage!
        byte myByte = 0;
        long myLong = 0;
    }
}