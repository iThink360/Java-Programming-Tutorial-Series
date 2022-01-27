/** Java API Documentation for java.lang.Math:
 * --> https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 */

/** Some examples of the Java Math class. The Math class, in a nutshell, exploits
 * basic operators and incorporates much more complex calculations, from seemingly
 * simple things (like exponentiation and square roots), to complex things (like
 * trigonometry).
 * 
 * We only covered a few examples, since there's so many methods to talk about
 * and it's not worth spending a whole video analyzing them.
 */

/* Contents: a few examples of methods from the Math class. */
public class Mathematics
{
    public static void main(String[] args)
    {
        // Example 1 (Math.pow(x, y) --> Exponentiation)
        double exponent = Math.pow(5, 2); // to store as int, cast! --> (int)
        System.out.println(exponent);
        
        // Example 2 (Math.sqrt(x) --> Square Root)
        double squareRoot = Math.sqrt(81);
        System.out.println(squareRoot);
        System.out.println(Math.sqrt(-1)); // imaginary --> NaN
        
        // Example 3 (Math.sin(x) --> Trigonometric Sine)
        double sine = Math.sin(Math.PI/6);
        System.out.println(sine); // roundoff errors due to binary representation of decimal numbers
        
        // Example 4 (Math.asin(x) --> Trigonometric Inverse Sine)
        double arcsine = Math.asin(1);
        System.out.println(arcsine);
        System.out.println(Math.PI/2);
    }
}