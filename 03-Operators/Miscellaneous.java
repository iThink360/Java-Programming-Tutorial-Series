public class Miscellaneous
{
    public static void main(String[] args)
    {
        // Ternary Operator (?:)
        int myTernary = (4 == 4) ? 5 : 3;
        System.out.println(myTernary);
        System.out.println((4 == 4) ? 5 : 3);
        
        // Instanceof Operator (instanceof)
        String myString = "Hello!";
        boolean myInstanceOf = myString instanceof String;
        System.out.println(myInstanceOf);
    }
}