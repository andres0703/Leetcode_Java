
/**
 * reverse input string
 * @author andres
 * @date 9/4/2018
 */
public class ReverseString {

    /*
    // easy approach using stringbuilder, time: O(n), space: O(n).
    public static String reverse(String str) {
        StringBuilder res = new StringBuilder(str);
        return res.reverse().toString();
    }
    */
    
    /*
    // swap the characters with two pointers, O(n) time and O(n) space
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);  // use new String(arr) instead of arr.toString()
    }
    */
    
    // divide & conquer, T(n) = 2 * T(n/2) + O(n), solved time: O(n*logn)
    public static String reverse(String str) {
        int len = str.length();
        if (len == 1) return str;
        String leftHalf  = str.substring(0, len / 2);
        String rightHalf = str.substring(len / 2, len);
        return reverse(rightHalf) + reverse(leftHalf);
    }
    
    public static void main(String[] args) {
        String a = "abcdefg";
        System.out.println(reverse(a));
    }
}
