/** Arrays are used to hold data, and they behave like Objects (having their
 * own fields and methods).
 * 
 * To declare an array, you must specify the data type with square brackets [],
 * specify a reference name, and then do one of four things:
 * 
 *      --> Use an initializer list with curly braces and input your data elements
 *          with commas in between
 *      --> Use the new keyword followed by the same data type and square brackets,
 *          with the square brackets holding a specified length that you want for
 *          your array (remember arrays can't grow or shrink!) 
 *      --> Set your array reference equal to a previously created array, in which
 *          case both references will be pointing to the same array Object in memory
 *          (we will learn more about this down the road)
 *      --> Set the array reference equal to null
 *      
 * To access an array element, use the reference name, followed by square brackets
 * with the element index number. Array indices, similar to Strings, range from 0 to
 * 1 less than the array length. To access the array length, reference the final length
 * constant field from an array reference.
 * 
 * You can also loop through arrays, although I decided to leave this more up
 * to you to learn and attempt to implement on your own in the Module 1
 * challenge ;-)
 * 
 */

/* Contents: practice with arrays and loops */
public class ArraysIntro
{
    public static void main(String[] args)
    {
        
        System.out.println(new ArraysIntro() instanceof ArraysIntro);
        // Example 1: Creating an Object Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        // Example 2: Creating a Primitive Array
        int[] myNums = {10, 20, 30, 40, 50, 60};
        
        // Example 3: Creating an Empty Array
        myNums = new int[13];
        
        // Example 4: Accessing Array Elements
        cars[0] = "Lamborghini";
        
        // Example 5: Printing Array Elements
        System.out.println(cars);
        
        // Example 6: Array Length
        int lengthOfNums = myNums.length; // 13
        
        // Example 7: Loop Through the cars Array
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
        
        // Example 8: For-Each Loop
        for (String car : cars)
        {
            // code to be executed "for each" String of reference car in the
            // cars array
            
            System.out.println(car);
        }
    }
}