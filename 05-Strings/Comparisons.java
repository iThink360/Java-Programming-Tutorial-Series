// compareTo(String) - compares two Strings in terms of dictionary order.
// compareToIgnoreCase(String) - the same thing, but excluding case sensitivity.

// Both methods return ints, signifying the difference in ASCII codes.

// A positive int means that the parameter String comes BEFORE.
// A negative int means that the parameter String comes AFTER.

public class Comparisons
{
    public static void main(String[] args)
    {
        // Declare some Strings
        String first = "apple";
        String second = "banana";
        String third = "cat";
        
        // Some comparisons, including comparisons of anonymous Strings
        System.out.println(first.compareTo(second)); // -
        System.out.println(third.compareTo(first)); // +
        System.out.println(second.compareTo("banana")); // 0
        System.out.println(second.compareTo("Banana")); // +
        
        // An example of ignored character casing
        System.out.println(second.compareToIgnoreCase("Banana")); // 0
        
    }
}