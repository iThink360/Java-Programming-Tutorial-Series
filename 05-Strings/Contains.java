// contains(String) - Checks a String for a sequence of characters (parameter).

// Returns true if the parameter String exists within the String that the method was called on, false otherwise.

public class Contains
{
    public static void main(String[] args)
    {
        String greetings = "Hello!";
        
        System.out.println(greetings.contains("!")); // prints true
        System.out.println(greetings.contains("ell")); // prints true
        System.out.println(greetings.contains("abcd")); // prints false
        System.out.println(greetings.contains("Help")); // prints false
        System.out.println(greetings.contains("hello!")); // prints false
        System.out.println("Hello!".contains("Hel")); // prints true
    }
}