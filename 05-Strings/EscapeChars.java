// Escape Characters - direclty added within Strings to initiate some command
// or insert a letter.

public class EscapeChars
{
    public static void main(String[] args)
    {
        // Textual Escape Characters: \", \', \\
        String blah = "Some \"piece\" of text";
        System.out.println(blah);
        
        // Command Escape Characters: \n, \t, \r, \b, \f
        System.out.println("Hello\nWorld!");
        System.out.println("Number of Accounts:\t100");
        
        // Unicode Escape Characters
        System.out.println("\u0976");
    }
}