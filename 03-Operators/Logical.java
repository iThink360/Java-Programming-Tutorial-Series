public class Logical
{
    public static void main(String[] args)
    {
        // Logical AND (&&)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        
        // Logical OR (||)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        
        // Logical NOT (!)
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}