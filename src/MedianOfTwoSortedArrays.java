import java.util.Arrays;

/**
 * leetcode problem #4 (medium): Median of two sorted array.
 * @author andres
 *
 */
public class MedianOfTwoSortedArrays {
    
    // O(nlogn) time complexity
    public static int median(int[] a, int[] b) {
        int[] combined = merge(a, b);
        int len = combined.length;
        Arrays.sort(combined);
        if (len % 2 == 0) 
            return (combined[len / 2] + combined[len / 2 + 1]) / 2;
        else
            return combined[len / 2];
    }
    
    private static int[] merge(int[] a, int[] b) {
        int len1 = a.length, len2 = b.length;
        int[] combined = new int[len1 + len2];
        for (int i = 0; i < len1 + len2; i++) {
            if (i < len1)
                combined[i] = a[i];
            else
                combined[i] = b[i - len1];
        }
        return combined;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9};
        int[] b = {2, 4, 6};
        
        System.out.println(median(a, b));
    }
}
