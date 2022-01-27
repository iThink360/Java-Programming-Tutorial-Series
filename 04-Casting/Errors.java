public class Errors
{
    public static void main(String[] args)
    {
        /* No Booleans! */
        int myInt = false;
        int myOtherInt = (int) false;
        
        /* Chars and Strings are NOT interchangeable! */
        char myChar = (char) "3";
        String myString = (String) '3';
    }
}