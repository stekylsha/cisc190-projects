package rounding;

public class AverageF implements Averager {
    public void average(double[] nums) {
        float result = 0;
        int numsIndex;
        for (numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            result = result + (float)(nums[numsIndex]);
        }
        System.out.println("Using floats:");
        System.out.format("Total is %4.12f%n", result);
        System.out.format("Average is %4.12f%n", (float)(result / nums.length));
    }
}
