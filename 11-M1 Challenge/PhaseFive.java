/** Phase 5: Relational Operators, instanceof, and Boolean Expressions */

public class PhaseFive
{
    public static void main(String[] args)
    {
        /* Mission 1 */
        boolean boolExpOne = 3 == 4;
        boolean boolExpTwo = 'i' < 'T';
        boolean boolExpThree = "iThink360".equals("iThink360");
        
        /* Mission 2 */
        System.out.println((boolExpOne && boolExpTwo) || (boolExpThree &&
            boolExpOne) || (boolExpTwo || !boolExpThree) || !(boolExpOne ||
            boolExpOne));
        
        /* Mission 3 */
        System.out.println("silly string" instanceof String);
        
        /* Mission 4: BONUS */
        System.out.println(new PhaseFive() instanceof PhaseFive);
    }
}