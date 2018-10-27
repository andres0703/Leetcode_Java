import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author andres
 *
 */
public class TwoSum {

	public static int[] twoSums(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No solution.");
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 4, 5, 2, 9, 7, 12, 14, 22, 18};
		int target = 36;
		
		int[] twoSums = twoSums(nums, target);
		System.out.println(twoSums[0] + ", " + twoSums[1]);
	}
}
