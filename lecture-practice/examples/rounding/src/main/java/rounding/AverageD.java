package rounding;

public class AverageD implements Averager {
    public void average(double[] nums) {
        double result = 0;
        int numsIndex;
        for (numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            result = result + nums[numsIndex];
        }
        System.out.println("Using doubles:");
        System.out.format("Total is %4.12f%n", result);
        System.out.format("Average is %4.12f%n", (result / nums.length));
    }
}
