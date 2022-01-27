/** The do-while loop is the exact same thing as the while loop, except that
 * the do-while loop will execute the code block AT LEAST ONCE before behaving
 * like a standard while loop (where a condition is checked). Think of it as
 * more or less a reverse while loop.
 * 
 * To comprehend this loop better, I suggest first learning about while loops.
 * You can check While.java for the description on whiles.
 */

/* Contents: practice with do-while loops */
public class DoWhile
{
    public static void main(String[] args)
    {
        // Example
        int i = 0;
        do
        {
            System.out.println(i);
            i++;
        } while (i <= 5);
        
        // Statement to be executed after do-while loop ends
        System.out.println("The do-while has ended.");
    }
}