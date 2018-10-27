import java.util.Arrays;

/**
 * This algorithm computes the majority element(more than half) of the input array.
 * @author andres
 * @date 08/28/2018
 */
public class MajorityElement {
    
    // my clumsy algorithm O(nlgn)
    public static int majElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int countMax = 0;
        int res = 0;
        int count = 1;
        
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > countMax)  {
                    res = nums[i - 1];
                    countMax = count;
                }
                count = 1;
            }
            if (i == len - 1 && count > countMax) {
                res = nums[i - 1];
                countMax = count;
            }
        }
        if (countMax >= len / 2) return res;
        else return -1;
    }
    
    /*
    // trick solution, O(nlgn)
    public static int majElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    */

    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 3, 3, 3, 4, 4, 4, 4, 4};
        System.out.println(majElement(nums));
    }
}
