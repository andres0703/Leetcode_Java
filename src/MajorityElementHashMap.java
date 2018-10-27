import java.util.HashMap;
import java.util.Map;

/*
 *  This algorithm takes an array as input and returns the majority element (whichever is the most)
 *  using hashmap. It runs in O(n) time.
 */
public class MajorityElementHashMap {

    private static HashMap<Integer, Integer> getMap(int[] nums) {
        HashMap<Integer, Integer> majorityMap = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (majorityMap.containsKey(nums[i]))
                majorityMap.put(nums[i], majorityMap.get(nums[i]) + 1);
            else
                majorityMap.put(nums[i], 1);
        }
        return majorityMap;
    }
    
    public static int MajorityElement(int[] nums) {
        HashMap<Integer, Integer> map = getMap(nums);
        
        Map.Entry<Integer, Integer> majorEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorEntry == null || entry.getValue() > majorEntry.getValue()) {
                majorEntry = entry;
            }
        }
        return majorEntry.getKey();
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 3, 3, 3, 4, 4, 4, 4, 4};
        System.out.println(MajorityElement(nums));
    }   
}
