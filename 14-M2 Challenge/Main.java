public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {3, 2, 4, 6, 9, 4, 2, 1, 0, 0, 349, 50};
        int[] arr2 = {2, 7, 1, 8, 2, 8, 1, 8, 2, 8, 4, 9, 5, 0, 4, 5};
        
        StatSet stat1 = new StatSet(arr1);
        StatSet stat2 = new StatSet(arr2);
        
        stat1.printData();
        stat2.printData();
    }
}