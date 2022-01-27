public class Widening // Automatic
{
    public static void main(String[] args)
    {
        // Example 1 (integer to decimal)
        double myDouble = 5;
        System.out.println(myDouble);
        
        float myFloat = 5;
        System.out.println(myFloat);
        
        // Example 2 (byte to short to int)
        byte myByte = 4;
        short myShort = myByte;
        int myInt = myShort;
        System.out.println(myInt);
        
        // Example 3 (short into char)
        char myChar = 65;
        System.out.println(myChar);
    }
}