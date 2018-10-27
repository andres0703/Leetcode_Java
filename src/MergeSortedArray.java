/**
 * Leetcode problem #88 easy: merge sorted array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * @author andres
 * @date 10/10/2018
 */
public class MergeSortedArray {

    // concise version, time O(m + n), space O(m + n)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    
    /* 
    // verbose version, same thing
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = n + m - 1;
        while(i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--; i--;
            } else {
                nums1[k] = nums2[j];
                k--; j--;
            }
        }
        
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--; j--;
        }
    }
    */
    
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 10, 15, 0, 0, 0, 0, 0, 0};
        int[] b = {9, 16};
        merge(a, 6, b, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
