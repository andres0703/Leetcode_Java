import java.util.Arrays;

/**
 * Three sum closest problem.
 * Takes an integer array and an integer target as input, 
 * returns the closest three sum to the target.
 * @author andres
 *
 */
public class ThreeSumClosest {
    
    public static int TSC(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < len - 2; i++) {
            int diff = target - nums[i];
            int lo = i + 1, hi = len - 1;
            
            while (lo < hi) {
                int currDiff = Math.abs(nums[lo] + nums[hi] + nums[i] - target);
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    closestSum = nums[lo] + nums[hi] + nums[i];
                }
                if (nums[lo] + nums[hi] == diff) return target;
                if      (nums[lo] + nums[hi] < diff)  lo++;
                else if (nums[lo] + nums[hi] > diff)  hi--;
            }
        }
        return closestSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4, 32, -3, 9, 43, 12, 22, 65};
        System.out.println(TSC(nums, 2));
    }
}
