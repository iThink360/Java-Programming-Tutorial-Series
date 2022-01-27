/** Phase 9: Conditionals */

public class PhaseNine
{
    public static void main(String[] args)
    {
        /* Mission 1 */
        int myIntOne = 32;
        int myIntTwo = 6;
        
        /* Mission 2 */
        if (myIntOne > myIntTwo)
        {
            System.out.println(myIntOne);
        }
        else if (myIntTwo > myIntOne)
        {
            System.out.println(myIntTwo);
        }
        else
        {
            System.out.println("Equal!");
        }
        
        /* Mission 3 */
        String result = (myIntOne > myIntTwo) ? Integer.toString(myIntOne) :
            (myIntTwo > myIntOne) ? Integer.toString(myIntTwo) : "Equal!";
        System.out.println(result);
        
        /* Mission 4 */
        int time = 8;
        switch (time)
        {
            case 0:
                System.out.println("12:00 AM");
                break;
            case 1:
                System.out.println("1:00 AM");
                break;
            case 2:
                System.out.println("2:00 AM");
                break;
            case 3:
                System.out.println("3:00 AM");
                break;
            case 4:
                System.out.println("4:00 AM");
                break;
            case 5:
                System.out.println("5:00 AM");
                break;
            case 6:
                System.out.println("6:00 AM");
                break;
            case 7:
                System.out.println("7:00 AM");
                break;
            case 8:
                System.out.println("8:00 AM");
                break;
            case 9:
                System.out.println("9:00 AM");
                break;
            case 10:
                System.out.println("10:00 AM");
                break;
            case 11:
                System.out.println("11:00 AM");
                break;
            case 12:
                System.out.println("12:00 PM");
                break;
            case 13:
                System.out.println("1:00 PM");
                break;
            case 14:
                System.out.println("2:00 PM");
                break;
            case 15:
                System.out.println("3:00 PM");
                break;
            case 16:
                System.out.println("4:00 PM");
                break;
            case 17:
                System.out.println("5:00 PM");
                break;
            case 18:
                System.out.println("6:00 PM");
                break;
            case 19:
                System.out.println("7:00 PM");
                break;
            case 20:
                System.out.println("8:00 PM");
                break;
            case 21:
                System.out.println("9:00 PM");
                break;
            case 22:
                System.out.println("10:00 PM");
                break;
            case 23:
                System.out.println("11:00 PM");
                break;
            default:
                System.out.println("Time is unavailable.");
                break;
        }
    }
}