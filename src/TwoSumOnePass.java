import java.util.Map;
import java.util.HashMap;

public class TwoSumOnePass {

	public static int[] TwoSums(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			int complement = target - nums[i];
			map.put(nums[i], i);
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {map.get(complement), i};
			}
		}
		
		throw new IllegalArgumentException("No solution.");
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 4, 5, 2, 9, 7, 12, 14, 22, 18};
		int target = 36;
		
		int[] twoSums = TwoSums(nums, target);
		System.out.println(twoSums[0] + ", " + twoSums[1]);
	}
}
