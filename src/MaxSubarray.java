
public class MaxSubarray {
    
    // find the maximum sum sub-array by brute force
    public static int maxSubBrute(int[] nums) {
        int res = Integer.MIN_VALUE;
        int len = nums.length;
        for (int l = 1; l <= len; l++) {
            for (int i = 0; i + l <= len; i++) {
                int sum = 0;
                for (int j = i; j < i + l; j++)
                    sum += nums[j];
                if (sum > res)  res = sum;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, -7, -1, -4, 5, 3, 9};
        System.out.println(maxSubBrute(nums));
    }
}
