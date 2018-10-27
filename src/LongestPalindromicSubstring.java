/**
 * Leetcode No.4 (medium): longest palindromic substring
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * 
 * @author andres
 * @date 10/26/2018
 * 
 */
public class LongestPalindromicSubstring {
    private int lo, maxLen;
	
    /*
     *  expand around center method
     *  time: O(n^2)
     */
	public String longestPalindrome(String str) {
	    int len = str.length();
	    if (len <= 1 || str == null) {
	    	return str;
	    }
	    for (int i = 0; i < len; i++) {
	    	expandCenter(str, i, i);
	    	expandCenter(str, i, i + 1);
	    }
	    return str.substring(lo, lo + maxLen);
	}
	
	// expand around center
	private void expandCenter(String str, int left, int right) {
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		if (maxLen < right - left - 1) {
			lo = left + 1;
			maxLen = right - left - 1;
		}
	}
    
    public static void main(String[] args) {
        String a = "ACECCBABC";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome(a));
    }
}
