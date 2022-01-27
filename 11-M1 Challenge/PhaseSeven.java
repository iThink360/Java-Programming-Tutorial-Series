/** Phase 7: Strings */

public class PhaseSeven
{
    public static void main(String[] args)
    {
        /* Mission 1 */
        String myString = "Java Rocks!";
        
        /* Mission 2 */
        System.out.println(myString.equals("java rocks!"));
        
        /* Mission 3 */
        System.out.println(myString.compareTo("java rocks!"));
        
        /* Mission 4 */
        System.out.println(myString.length());
        
        /* Mission 5 */
        String myBigString = "          " + myString + "           ";
        
        /* Mission 6 */
        System.out.println(myBigString);
        System.out.println(myBigString.trim());
        
        /* Mission 7 */
        System.out.println(myString.indexOf("!"));
        
        /* Mission 8 */
        String mySubString = myString.substring(5) + "\n";
        System.out.println(mySubString);
    }
}