public class Recursion
{
    public static int factorial(int num)
    {
        if (num == 0) // base case
            return 1;
        else
            return num * factorial(num - 1);
    }
    
    public static int factorialIterative(int num)
    {
        int result = 1;
        for (int i = 2; i <= num; i++)
            result *= i;
        return result;
    }
    
    public static int fib(int index)
    {
        // 1, 1, 2, 3, 5, 8, 13, ...
        
        if ((index == 1) || (index == 0))
            return index;
        else
            return fib(index - 1) + fib(index - 2);
    }
    
    public static int fibIterative(int index)
    {
        int x = 0, y = 1, z = 1;
        
        for (int i = 0; i < index; i++)
        {
            x = y;
            y = z;
            z = x + y;
        }
        
        return x;
    }
}