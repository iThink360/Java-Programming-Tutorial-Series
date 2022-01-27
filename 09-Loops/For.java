/** For loops are often used when you are certain of the amount of times that
 * you want to loop a code block. For loops are commonly used for looping
 * through arrays, or just generally looping a code block.
 * 
 * To declare a for loop, use the for keyword, followed by parantheses and a
 * pair of curly braces. You should have something like this:
 * 
 *      for (statement1; statement2; statement3)
 *      {
 *          // code to be looped
 *      }
 *      
 *      --> statement1 is a code statement that will get executed ONLY ONCE
 *          BEFORE the loop begins. This is often used to initialize an
 *          iterator/counter to a certain index. Maybe something like "int
 *          i = 0;" would be used for statement1 to specify an iterator
 *          beginning from count 0.
 *      --> statement2 is the condition that must be true for the for loop to
 *          begin. It is also the condition that must be met for the loop to
 *          continue looping. In for loops, this is usually a specified range
 *          that is bounded by the initial value of the iterator and the value
 *          set in here. Continuing with the statement1 example from above, if
 *          statement2 were something like "i < 10;", then the iterator i (from
 *          statement1) would be compared using the less than operator against
 *          10. If the condition evaluates to true, then the code block executes
 *          once, after which statement3 is called.
 *      --> statement3 is executed every single time after an iteration is
 *          complete. Usually this will be an increment/decrement of our iterator.
 *          For example, we can put "i++" here to increment our iterator by 1
 *          each time after an iteration finishes. When we combine this example
 *          of statement3 with the examples of statement1 and statement2 from
 *          above, we get a for loop executing its code a total of 10 times!
 * 
 * Try it out yourself!
 */

/* Contents: practice with for loops */
public class For
{
    public static void main(String[] args)
    {
        // Example
        for (int i = 1; i <= 10; i++)
        {
            // code to be looped
            System.out.println(i);
            
            if (i == 6)
            {
                continue; // for information on break/continue, refer to README.TXT
            }
        }
        
        // Statement to be printed after for loop ends
        System.out.println("The for has ended.");
    }
}