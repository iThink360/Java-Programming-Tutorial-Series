/** If statements are used to execute certain blocks of code when specified
 * conditions are valid. If statements are created using the if keyword,
 * followed by a pair of parantheses () containing a condition represented by
 * a boolean. A boolean variable, method call return value, expression, and
 * so on would be valid for a condition for an if statement. REMEMBER: the old
 * trick for data "slots" that we've emphasized in prior episodes!
 * 
 * After the if and condition have been declared, open and close curly braces
 * {} and put any code statements inside here. If, and ONLY if, an if
 * statement's respective condition evaluates to true, the code in the
 * corresponding curly braces will execute.
 * 
 * To further expand on this, use the else keyword to specify a block of code
 * to execute if the original condition was false. You can also use the else if
 * keyword and add a second condition to execute, if you wish. Note that every
 * if statement MUST have an if condition, may have up to one else block of
 * code, and can have as many else-if's as desired. However, various else-if's
 * may likely indicate that a switch statement is in order. (Episode 12...)
 * 
 * A cool hack... if your if statement's code block has ONLY one code statement
 * (COMMENTS EXCLUDED), you can omit the surrounding braces. I didn't do this
 * here so as to avoid confusion for new programmers. However, experiment and
 * try it out!
 * 
 * BONUS: Remember how we learned about the ternary operator? That's right...
 * it comes into play here. Often times, you can shrink simple if-else
 * statements down into the ternary operator, especially when assigning or
 * returning a single piece of data. This is very useful in certain
 * situations!
 */

/* Contents: practice with if, else, and else-if. */
public class IfStatements
{
    public static void main(String[] args)
    {
        // Example 1
        if (20 > 18)
        {
            // code to be executed if 20 > 18
            System.out.println("20 is greater than 18!");
        }
        
        // Example 2
        int x = 20;
        int y = 18;
        if (x > y)
        {
            // code to be executed if x > y
            System.out.println("x is greater than y!");
        }
        
        // Example 3
        int time = 20;
        if (time < 18)
        {
            // code to be executed if time < 18 (original condition is TRUE)
            System.out.println("Good day.");
        }
        else
        {
            // code to be executed if time > 18 (original condition is FALSE)
            System.out.println("Good evening.");
        }
        
        // Example 4
        time = 22;
        if (time < 10)
        {
            // code to be executed if time < 10 (original condition is TRUE)
            System.out.println("Good morning.");
        }
        else if (time < 20)
        {
            // code to be executed if time < 20
            // original condition is FALSE but this condition is TRUE
            System.out.println("Good day.");
        }
        else
        {
            // code to be executed if both conditions are FALSE)
            System.out.println("Good evening.");
        }
        
        // BONUS: Ternary Operator
        String result = (time < 10) ? "Good morning." : (time < 20) ? "Good day." : "Good evening.";
        System.out.println(result);
        System.out.println((time < 10) ? "Good morning." : (time < 20) ? "Good day." : "Good evening.");
    }
}