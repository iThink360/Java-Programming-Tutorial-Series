// indexOf(String) - Searches the String for the first occurrence of the parameter.
// lastIndexOf(String) - Same thing, except searching for the LAST occurrence.

// Returns an int representing the index of the parameter String within the larger String.

// If the parameter String does not exist in the original String, -1 is returned.

public class IndexOf
{
    public static void main(String[] args)
    {
        // indexOf(String)
        
        // Indices.....012345
        String blah = "QWERTY";
        
        int myIndex = blah.indexOf("ERT");
        System.out.println(myIndex);
        
        System.out.println(blah.indexOf("t"));
        
        // lastIndexOf(String)
        // Indices.........012
        String myString = "959";
        System.out.println(myString.lastIndexOf("9"));
    }
}