import java.util.Set;
import java.util.HashSet;

public class LengthOfLongestSubstring {
    
	public static int LOLS(String s) {
        int l = s.length();
        int i = 0, j = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<Character>();
       
        while (j < l && i < l) {
        	Character a = s.charAt(j);
        	if (!set.contains(a)) {
        		set.add(a);
        		j++;
        		maxLength = Math.max(j - i, maxLength);
        	}
        	else {
        		set.remove(s.charAt(i++));
        	}
        }
        return maxLength;
	}
	
	public static void main(String[] args) {
		String s = "abcabcdefcdefghijk";
		System.out.println(LOLS(s));
	}
	
}
