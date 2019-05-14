package rounding;

public class AverageD implements Averager {
    public void average(double[] nums) {
        double result = 0;
        int numsIndex;
        for (numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            result = result + nums[numsIndex];
        }
        System.out.println("Total is " + result);
        System.out.println("Average is " + (result / nums.length));
    }
}
