// toUpperCase() - Capitalizes the letters in a String.
// toLowerCase() - Lowercases the letters in a String.

// Both methods return a duplicate of the String, but modified as desired.
// NOTE: Both methods leave the original String unchanged!

public class UpperAndLowerCasing
{
    public static void main(String[] args)
    {
        String example = "Hello!";
        
        // Some Examples
        System.out.println(example.toUpperCase()); // "HELLO!"
        System.out.println(example.toLowerCase()); // "hello!"
        
        // NOT Useful!
        example.toUpperCase();
        System.out.println(example); // prints out "Hello!"
    }
}