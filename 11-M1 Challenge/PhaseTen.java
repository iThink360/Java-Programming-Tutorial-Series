/** Phase 10: Arrays and Loops */

public class PhaseTen
{
    public static void main(String[] args)
    {
        /* Mission 1 */
        int[] myIntArray = {1, 2, 3, 4, -5, 6, 7, -8, 9, 10, 11, -12, 13, -14,
            -15, -16, 17, -18, 19, -20};
        
        /* Mission 2 */
        for (int i = 0; i < myIntArray.length; i++)
        {
            System.out.println(myIntArray[i]);
        }
        
        /* Mission 2 (BONUS) */
        for (int num : myIntArray)
        {
            System.out.println(num);
        }
        
        /* Mission 3 */
        int i = 0;
        while (i < myIntArray.length)
        {
            myIntArray[i] *= -1;
            
            System.out.println(myIntArray[i]);
            
            i++;
        }
    }
}