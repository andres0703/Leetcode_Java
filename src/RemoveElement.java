/**
 * Leetcode #27 easy: Remove Element
 * 
 * @author andres
 * @date 10/21/2018
 * 
 */
public class RemoveElement {

    /*
     * time: O(n)
     * space: O(1)
     */
    public static int removeEle(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 9, 6, 8};
        System.out.println(removeEle(nums, 6));
        printArr(nums);
    }
}
