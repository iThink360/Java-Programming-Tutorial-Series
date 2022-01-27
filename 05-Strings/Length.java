// length() - Calculates the length of a given String and returns it.

public class Length
{
    public static void main(String[] args)
    {
        // Printing the Length of a String Variable
        String sillyString = "Blah!";
        int length = sillyString.length();
        System.out.println(length);
        
        // Printing the Length of a String Variable with Excess Whitespace!
        String sillyBigString = "        B       l      a   h !  ";
        System.out.println(sillyBigString.length());
        
        // Printing the Length of a String Literal with Whitespace ONLY
        System.out.println("     ".length());
        
        // Print the Length of an Empty String Variable
        String empty = "";
        System.out.println(empty.length());
    }
}