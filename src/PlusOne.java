/**
 * leetcode problem #66 (medium): Plus One.
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 
 * Time: O(n)
 * 
 * @author andres
 * @date 10/9/2018
 */
public class PlusOne {
    
    /*
    // my clumsy method which may not work for large inputs 
    public int[] plusOne(int[] input) {
        int len = input.length;
        int output = 0;
        for (int i = 0; i < len; i++) {
            output += (Math.pow(10, len - 1 - i)) * input[i];
        }
        System.out.println(output);
        output++;
        return toArray(output);
    }
    
    private int[] toArray(int num) {
        int digits = String.valueOf(num).length();
        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        
        int[] res = new int[digits];
        for (int i = 0; i < digits; i++) {
            res[i] = arr[digits - 1 - i];
        }
        return res;
    }
    */
    
    // the method that doesn't bother switch the array to a number first
    public int[] plusOne(int[] input) {
        int len = input.length;
        for (int i = len - 1; i >= 0; i--) {
            if (input[i] < 9) {
                input[i]++;
                return input;
            }
            input[i] = 0;
        }
        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }
    
    // print out array
    private static void printArr(int[] arr) {
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8};
        int[] b = {1, 2, 3, 9};
        int[] c = {9, 9, 9, 9};
        
        PlusOne po = new PlusOne();
        printArr(po.plusOne(a));
        printArr(po.plusOne(b));
        printArr(po.plusOne(c));
    }
}
