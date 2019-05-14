package rounding;

import java.math.BigDecimal;

public class AverageBD implements Averager {
    public void average(double[] nums) {
        BigDecimal result = BigDecimal.ZERO;
        int numsIndex;
        for (numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            result = result.add(new BigDecimal(nums[numsIndex]));
        }
        System.out.println("Total is " + result);
        System.out.println("Average is " + (result.divide(new BigDecimal(nums.length))));
    }
}
