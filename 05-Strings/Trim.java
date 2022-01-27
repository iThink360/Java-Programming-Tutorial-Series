// trim() - Trims leading and trailing whitespace (LEAVES ORIGINAL UNCHANGED)
// Returns a duplicate copy of the string, but trimmed

public class Trim
{
    public static void main(String[] args)
    {
        // Trim Example
        String someString = "         Gobbled y gook             ";
        System.out.println(someString);
        System.out.println(someString.trim());
    }
}