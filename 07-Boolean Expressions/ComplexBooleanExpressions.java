/** Complex boolean expressions contain a mixture of various operators,
 * comparisons, and method calls that all evaluate to yield a single true or
 * false. Principles of boolean algebra come into play here.
 * 
 * It's rare to see the raw true or false being used in boolean expressions,
 * though it is possible.
 * 
 * The null keyword may also be used in boolean expressions.
 */

/* Contents: a couple examples of complicated boolean expressions. */
public class ComplexBooleanExpressions
{
    public static void main(String[] args)
    {
        /* Example 1: Primitives Expression */
        boolean operatorExpression = 3 == 3 || 5 >= -3.14 && (!false && 'A' == 'A') || false;
        System.out.println(operatorExpression);
        
        /* Example 2: Object Methods Expression */
        boolean methodExpression = "String".equals("blah!") || "" == null;
        System.out.println(methodExpression); // false
    }
}