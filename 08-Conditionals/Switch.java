/** In certain cases (pun intended :-P), switch statements are useful to use
 * when you want to compare one datum against various possible cases to pick
 * and choose a block of code for execution.
 * 
 * You start with the switch keyword, followed by your data to switch in
 * parantheses. (You can use primitives and Strings, but other Objects won't
 * really work.) Then, within your curly braces, you specify various cases of
 * possibilites (as shown below), with corresponding code blocks. Then, you
 * break out of your code block once you're finished executing.
 * 
 * Refer to Episode 12 of my tutorial series for further clarification.
 */

/* Contents: practice with switch. */
public class Switch
{
    public static void main(String[] args)
    {
        /* Example 1: Simple Switch Statement */
        int num = 3;
        
        switch (num)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
        
        /* Example 2: Long Switch Statement */
        int day = 4;
        
        switch (day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        
        /* Example 3: Switch with Strings */
        String someNumber = "One";
        
        switch (someNumber)
        {
            case "One":
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
        }
        
        /* Example 4: The Default Keyword */
        switch (day) // 4
        {
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend...");
                break;
        }
    }
}