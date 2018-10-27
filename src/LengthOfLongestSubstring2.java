import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring2 {
    
	public static int LOLS2(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int ans = 0;
		int l = s.length();
		for (int i = 0, j = 0; j < l; j++) {
			if (map.containsKey(s.charAt(j))) {
			    i = Math.max(i, map.get(s.charAt(j)));
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "abcscdea";
		System.out.println(LOLS2(s));
	}
}