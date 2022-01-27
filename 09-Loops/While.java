/** While loops are actually the easiest loops to understand. They are typically
 * used when you are not sure how many times you want to loop a block of code.
 * 
 * To specify a while loop, you need to use the while keyword, followed by a
 * pair of parantheses with a boolean in it. This is often times a boolean
 * expression or condition of some sort that must be met for the loop to
 * execute. You then follow this up with a pair of curly braces that house
 * the looped code.
 * 
 * NOTE: You will need to specify some sort of iterator outside of the while
 * loop (BEFORE the loop signature line). You then need to increment this
 * iterator as a part of your looped code block. Otherwise, your code will
 * loop forever! You do not want this to happen.
 */

/* Content: practice with while loops */
public class While
{
    public static void main(String[] args)
    {
        // Example 1
        int i = 0; // i --> iterator
        while (i <= 5)
        {
            // code to be executed if i <= 5
            System.out.println(i);
            i++;
        }
        
        // Example 2
        String myString = "Hello World!";
        i = 0;
        while (i < myString.length())
        {
            // code to be executed if within bounds of myString
            String character = myString.substring(i, i+1);
            System.out.println(character);
            i++;
        }
    }
}