/** To declare variables as constant, we must use the final modifier. Once a
 * variable is declared final, it cannot be reassigned.
 * 
 * HOWEVER, if an Object is declared final, the Object can still mutate itself
 * using mutator methods. More to come... ;-)
 * 
 * Uses of the final Keyword:
 *      - Final Variables: creates non-reassignable constants.
 *      - Final Methods: creates a non-overridable method via subclass.
 *      - Final Classes: creates a non-inheritable class.
 *      --> Final methods and classes shall be examined down the road...
 */

/** The Math class contains 2 constants: pi and e (Euler's number). These are
 * declared to be public (publicly accessible from outside the Math class),
 * static (no need to create an Object of the Math class to access it), final
 * (unchangeable constant), and double (primitive type).
 * 
 * To reference these constants, you MUST use the class name (Math) and dot
 * notation to reference pi or e. The result: Math.PI and Math.E. Note that
 * we don't create Objects of the Math class, since both Math.PI and Math.E
 * are static. Furthermore, similar to the String class, the Math class is
 * automatically imported in every single class we create.
 */

/* Contents: practicing with final constants, Math.PI, and Math.E.
 * Compile-time errors intentionally left for viewing reference.
 */
public class Constants
{
    public static void main(String[] args)
    {
        // Basic Constants (THEY ARE IMMUTABLE)
        final int myInt = 0;
        myInt = 4;
        
        final String myString = "Blah!";
        myString = "Not Blah!";
        
        // Math Class Constants (pi and e)
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        // Math class constants are immutable!
        Math.PI = 3.14;
        Math.E = 2.718;
    }
}