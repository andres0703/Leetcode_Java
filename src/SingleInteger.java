import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode problem(easy) #136: Single Number
 * Given a non-empty array of integers, every element appears twice except for one. 
 * Find that single one.
 * 
 * @author andres
 * @date 9/5/2018
 */
public class SingleInteger {
    /*
    // use a hashmap and return whichever key has a count value of 1;
    public static int solution(int[] nums) {
        HashMap<Integer, Integer> map = getMap(nums);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey(); 
        }
        throw new IllegalArgumentException("no single integer");
    }
    
    private static HashMap<Integer, Integer> getMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])) 
                map.put(nums[i], 1);
            else 
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        return map;
    }
    */
    
    /*
     * smart solution using "xor"
     * basis: N ^ 0 = N;
     *        N ^ N = 0;
     * time: O(n)
     */
    public static int solution(int[] nums) {
        int len = nums.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res ^= nums[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7, 4, 1, 3, 7, 8};
        System.out.println(solution(nums));
    }
}
