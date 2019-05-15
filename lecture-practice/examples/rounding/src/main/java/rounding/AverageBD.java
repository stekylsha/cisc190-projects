package rounding;

import java.math.BigDecimal;

public class AverageBD implements Averager {
    public void average(double[] nums) {
        BigDecimal result = BigDecimal.ZERO;
        int numsIndex;
        for (numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            result = result.add(new BigDecimal(nums[numsIndex]));
        }
        System.out.println("Using BigDecimal:");
        System.out.format("Total is %s%n", result.toPlainString());
        System.out.format("Average is %s%n", (result.divide(new BigDecimal(nums.length)).toPlainString()));
    }
}
