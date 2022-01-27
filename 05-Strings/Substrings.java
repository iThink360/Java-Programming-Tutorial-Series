// substring(int) - Creates a substring from the index specified to the end.
// substring(int, int) - Creates a substring bounded by the specified indices.
// THE ORIGINAL STRING REMAINS UNCHANGED.

// Both methods return a new copy of the original String, modified as needed.
// NOTE: Ending index MUST be greater than starting index. Both must be within bounds!

public class Substrings
{
    public static void main(String[] args)
    {
        // Indices.........012345678901
        String template = "Gobbledygook";
        System.out.println(template);
        
        // substring(int)
        String mySubString = template.substring(8);
        System.out.println(mySubString);
        
        // substring(int, int)
        String myOtherSubString = template.substring(4, 7);
        System.out.println(myOtherSubString);
        
        // NOT ALLOWED - Throws a java.lang.StringIndexOutOfBoundsException
        String error1 = template.substring(7, 4);
        String error2 = template.substring(-59);
        String error3 = template.substring(13);
    }
}