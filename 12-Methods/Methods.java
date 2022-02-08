/** Methods are blocks of code that can be called as needed. Methods are a
 * super important part of programming, since they save a lot of effort and
 * keep programs running as efficiently as possible. They also reduce possible
 * errors in code.
 */

/* Contents: practice declaring methods, parameters, return type methods, and
 * overloaded methods! main() is also included here */
public class Methods
{
    // The main method
    public static void main(String[] args)
    {
        /* Calling methods */
        
        // Example 1
        printHello();

        // Example 2
        sum();
        
        // Example 3
        someMethodWithParameters(8);
        
        // Example 4
        int[] myNums = {1, 4, 3, 8, 9, 2, 0, 6, 4};
        double myMean = mean(myNums);
        System.out.println("The mean of myNums is " + myMean + "!");
        
        // Example 5
        int myRoll = dieRoll();
        System.out.println(myRoll);
        
        // Example 6
        sum();
        System.out.println(sum(2, -1));
        System.out.println(sum(myNums));
    }
    
    // Example 1 - Simple Method
    public static void printHello()
    {
        System.out.println("Hello, World!");
        System.out.println("How are you?");
        System.out.println("I'm doing good, thanks!");
    }
    
    // Example 2 - Simple Method
    public static void sum()
    {
        System.out.println(3 + 5);
    }
    
    // Example 3 - Method with Parameter
    public static void someMethodWithParameters(int x)
    {
        System.out.println(x);
    }
    
    // Example 4 - Method with Parameter and Complex Operations
    public static double mean(int[] nums)
    {
        int total = 0;
        for (int i = 0; i < nums.length; i++)
        {
            total += nums[i];
        }
        
        double mean = total / nums.length;
        
        return mean;
    }
    
    // Example 5 - Randomization Method with Return Type
    public static int dieRoll()
    {
        /* double temp = Math.random() * 6;
        int rand = (int) temp + 1;
        return rand; */
       
        // As a one liner...
        return (int) (Math.random() * 6) + 1;
    }
    
    // Example 6 - Overloaded Method
    public static int sum(int a, int b)
    {
        return a + b;
    }
    
    // Example 6, continued - Yet Another Overloaded Method
    public static int sum(int[] nums)
    {
        int total = 0;
        for (int num : nums)
        {
            total += num;
        }
        
        return total;
    }
}