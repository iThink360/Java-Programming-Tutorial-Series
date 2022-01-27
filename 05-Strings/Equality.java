// equals(String) - Returns true ONLY if both Strings are exactly identical.
// equalsIgnoreCase(String) - Same thing, excluding case sensitivity.

public class Equality
{
    public static void main(String[] args)
    {
        // Declare some Strings
        String template = "Hi there!";
        String other = "Hey!";
        
        // Call the equals() method
        boolean myBoolean = template.equals(other); // returns false
        boolean myOtherBoolean = other.equals("Hey!"); // returns true
        
        // Print out results
        System.out.println(myBoolean);
        System.out.println(myOtherBoolean);
        
        // An example of equalsIgnoreCase()
        System.out.println(other.equalsIgnoreCase("hey!")); // prints true
    }
}