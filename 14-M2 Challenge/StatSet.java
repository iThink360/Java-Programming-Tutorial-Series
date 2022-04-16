public class StatSet
{
    private int[] nums;
    private int arithmeticMean;
    private int geometricMean;
    private int median;
    private int mode;
    private int range;
    private int standardDeviation;
    
    public StatSet(int[] n)
    {
        nums = n;
        
        arithmeticMean = StatisticianToolbox.arithmeticMean(n);
        geometricMean = StatisticianToolbox.geometricMean(n);
        median = StatisticianToolbox.median(n);
        mode = StatisticianToolbox.mode(n);
        range = StatisticianToolbox.range(n);
        standardDeviation = StatisticianToolbox.standardDeviation(n);
    }
    
    public int[] getNums()
    {
        return nums;
    }
    
    public int getArithmeticMean()
    {
        return arithmeticMean;
    }
    
    public int getGeometricMean()
    {
        return geometricMean;
    }
    
    public int getMedian()
    {
        return median;
    }
    
    public int getMode()
    {
        return mode;
    }
    
    public int getRange()
    {
        return range;
    }
    
    public int getStandardDeviation()
    {
        return standardDeviation;
    }
    
    public void printData()
    {
        String numList = "[";
        
        for (int i = 0; i < nums.length - 1; i++)
            numList += nums[i] + ", ";
        numList += nums[nums.length - 1] + "]";
        
        System.out.println("List: " + numList);
        System.out.println("Arithmetic Mean: " + arithmeticMean);
        System.out.println("Geometric Mean: " + geometricMean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        System.out.println("Range: " + range);
        System.out.println("Standard Deviation: " + standardDeviation);
        
        System.out.println(); // line break in the terminal
    }
}