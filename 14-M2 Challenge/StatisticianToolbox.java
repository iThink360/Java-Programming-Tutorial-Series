import java.util.Arrays;

public class StatisticianToolbox
{
    // Mission 1 - Arithmetic mean
    public static int arithmeticMean(int[] nums)
    {
        int total = 0;
        
        for (int num : nums)
            total += num;
        
        return total / nums.length;
    }
    
    // Mission 2 - Geometric mean
    public static int geometricMean(int[] nums)
    {
        int total = 1;
        
        for (int num : nums)
            total *= num;
        
        return (int) Math.pow(total, 1 / nums.length);
    }
    
    // Mission 3 - Median
    public static int median(int[] nums)
    {
        Arrays.sort(nums);
        
        int middle = nums.length / 2;
        
        if (middle % 2 == 0)
        {
            // Array has an even amount of numbers, we need to average the
            // middle 2
            int num1 = nums[middle];
            int num2 = nums[middle - 1];
            
            return (num1 + num2) / 2;
        }
        else if (middle % 2 == 1)
        {
            // Array has an odd amount of numbers, return the middle number
            return nums[middle];
        }
        
        return -1;
    }
    
    // Mission 4 - Mode
    public static int mode(int[] nums)
    {
        int maxValue = 0;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            int count = 0;
            for (int j = 0; j < nums.length; j++)
                if (nums[i] == nums[j])
                    count++;
            
            if (count > maxCount)
            {
                maxValue = nums[i];
                maxCount = count;
            }
        }
        
        return maxValue;
    }
    
    // Mission 5 - Range
    public static int range(int[] nums)
    {
        int highest = nums[0];
        int lowest = nums[0];
        
        for (int num : nums)
            if (num > highest)
                highest = num;
            else if (num < lowest)
                lowest = num;
        
        return highest - lowest;
    }
    
    // Mission 6 - Standard deviation
    public static int standardDeviation(int[] nums)
    {
        int mean = arithmeticMean(nums);
        
        int sum = 0;
        for (int num : nums)
            sum += Math.pow(num - mean, 2);
        
        sum /= nums.length;
        return (int) Math.sqrt(sum);
    }
}