public class Relational
{
    public static void main(String[] args)
    {
        // Equality (==)
        boolean myEquality = 3 == 4;
        System.out.println(myEquality);
        System.out.println(3 == 4);
        
        // Inequality (!=)
        boolean myInequality = 3 != 4;
        System.out.println(myInequality);
        System.out.println(3 != 4);
        
        // Comparison (>, <, >=, <=)
        System.out.println(3 > 4); // false
        System.out.println(3 < 4); // true
        System.out.println(4 >= 4); // true
        System.out.println(4 <= 4); // true
        System.out.println(4 < 4); // false
    }
}