public class Narrowing // Manual
{
    public static void main(String[] args)
    {
        // Example 1 (decimal to integer)
        
        double control = 5.68;
        int experiment = (int) 5.68;
        
        System.out.println(control);
        System.out.println(experiment);
        
        // Example 2 (long to int to short to byte)
        long myLong = 45748235748905234L;
        System.out.println(myLong);
        
        int myInt = (int) myLong;
        System.out.println(myInt);
        
        short myShort = (short) myInt;
        System.out.println(myShort);
        
        byte myByte = (byte) myShort;
        System.out.println(myByte);
        
        // Example 3 (long/int to char)
        long someLong = 875642398754637L;
        char myChar = (char) someLong;
        System.out.println(myChar);
        
        int someInt = 34567999;
        char myOtherChar = (char) someInt;
        System.out.println(myOtherChar);
        
        int myCharASCII = myChar;
        int myOtherCharASCII = myOtherChar;
        System.out.println(myCharASCII);
        System.out.println(myOtherCharASCII);
    }
}