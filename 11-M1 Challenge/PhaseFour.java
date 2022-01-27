/** Phase 4: Logical Operators */

public class PhaseFour
{
    public static void main(String[] args)
    {
        /* Mission 1 */
        boolean boolOne = false;
        boolean boolTwo = false;
        
        /* Mission 2 */
        boolOne = !boolOne;
        
        /* Mission 3 */
        System.out.println(boolOne && boolTwo);
        System.out.println(boolOne || boolTwo);
        
        /* Mission 4 */
        System.out.println((boolTwo || !boolTwo) && !boolOne);
    }
}