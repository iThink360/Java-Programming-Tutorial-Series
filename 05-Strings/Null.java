// Null - an allocation in memory resembling nothing.

// NOTE - This was NOT discussed in the video due to corrupted footage!

public class Null
{
    public static void main(String[] args)
    {
        // Example 1
        String nullReference = null;
        
        // Example 2
        String example = "Hi! " + null;
        System.out.println(example);
        
        // Example 3
        String empty = null;
        System.out.println(empty == null);
        
        // java.lang.NullPointerException
        System.out.println(nullReference.substring(3));
    }
}