/** Boolean variables hold true or false. They are primitives.
 * 
 * Simple boolean expressions consist of single operators (relational/logical).
 * 
 * Boolean expressions may also consist of method calls and return values.
 * 
 * Furthermore, the instanceof operator may come into play for select boolean
 * expressions.
 */

/* Contents: practice of declaring booleans and simple boolean expressions. */
public class Booleans
{
    public static void main(String[] args)
    {
        /* Intro to Booleans */
        boolean isJavaFun = true;
        boolean areExamsFun = false;
        
        /* Example 1: Relational Operator Boolean Expression */
        boolean relationalOperatorExpression = 3 >= 5;
        System.out.println(relationalOperatorExpression); // false
        
        /* Example 2: Logical Operator Boolean Expression */
        boolean logicalOperatorExpression = true && true;
        System.out.println(logicalOperatorExpression); // true
        
        /* Example 3: Instanceof Operator Boolean Expression */
        boolean instanceofExpression = "Some String" instanceof String;
        System.out.println(instanceofExpression); // true
        
        /* Example 4: Object Method Call Boolean Expression */
        boolean objectMethodCallExpression = "Some Other String".equals("Some other String");
        System.out.println(objectMethodCallExpression); // false
    }
}