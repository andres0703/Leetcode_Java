/**
 * Leetcode problem(easy) #459: Repeated String Pattern.
 * Given a non-empty string check if it can be constructed by taking a substring of it 
 * and appending multiple copies of the substring together. 
 * You may assume the given string consists of lowercase English letters only 
 * and its length will not exceed 10000.
 * @author andres
 * @date 9/5/2018
 */
public class RepeatedSubstring {
    
    // time: O(n^2)
    public static boolean solution(String str) {
        int len = str.length();
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0) {
                String subStr = str.substring(0, i);
                int j;
                for (j = 0; j + i <= len; j += i) {
                    if (!str.substring(j, j + i).equals(subStr)) break;
                }
                if (j == len) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String a = "abababab";
        String b = "abcabc";
        String c = "abcde";
        String d = "";
        String e = "abcabdabcabd";
        String f = "aaaaaa";
        String[] arr = {a, b, c, d, e, f};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(solution(arr[i]));
        }
    }
}
