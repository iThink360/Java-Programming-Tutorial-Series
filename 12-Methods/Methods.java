/** Methods are blocks of code that can be called as needed. Methods are a
 * super important part of programming, since they save a lot of effort and
 * keep programs running as efficiently as possible. They also reduce possible
 * errors in code.
 */

/* Contents: practice declaring methods and methods with parameters! main()
   is also included here */
public class Methods
{
    // The main method
    public static void main(String[] args)
    {
        // Calling methods
        
        // Example 1
        printHello();

        // Example 2
        sum();
        
        // Example 3
        someMethodWithParameters(8);
        
        // Example 4
        int[] myNums = {1, 4, 3, 8, 9, 2, 0, 6, 4};
        mean(myNums);
    }
    
    // Example 1
    public static void printHello()
    {
        System.out.println("Hello, World!");
        System.out.println("How are you?");
        System.out.println("I'm doing good, thanks!");
    }
    
    // Example 2
    public static void sum()
    {
        System.out.println(3 + 5);
    }
    
    // Example 3
    public static void someMethodWithParameters(int x)
    {
        System.out.println(x);
    }
    
    // Example 4
    public static void mean(int[] nums)
    {
        int total = 0;
        for (int i = 0; i < nums.length; i++)
        {
            total += nums[i];
        }
        
        double mean = total / nums.length;
        
        System.out.println(mean);
    }
}