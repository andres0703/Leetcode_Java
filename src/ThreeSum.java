import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode No.15 Three sum problem.
 * @author andres
 * @date 7/29/2018
 */
public class ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        int len = num.length;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < len - 2; i++) {
            int lo = i + 1, hi = len - 1;
            int target = -num[i];
            
            while (lo < hi) {
                if (num[lo] + num[hi] == target) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo + 1]) lo++;  // avoid duplicate
                    while (lo < hi && num[hi] == num[hi - 1]) hi--;  // avoid duplicate
                    lo++; hi--;
                }
                else if (num[lo] + num[hi] < target)  lo++;
                else if (num[lo] + num[hi] > target)  hi--;
            }
            while (i < len - 2 && num[i] == num[i + 1]) i++;  // avoid duplicate
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] num1 = {9, 8, 1, 4, -5, -4, 1, -1, 2, 3, 9, 9, 9, 9, 9};
        int[] num2 = {-1, -2, 1, 0, 0, 0, 0, 3, 4, 5, 7};
        System.out.println(threeSum(num1));
        System.out.println(threeSum(num2));
    }
}
