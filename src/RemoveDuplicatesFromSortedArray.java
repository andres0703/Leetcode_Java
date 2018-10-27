public class RemoveDuplicatesFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        int i = 0, len = nums.length;
        for (int j = 0; j < len; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 2, 3, 3, 4, 5, 5};
        System.out.println(removeDuplicates(nums));
    }
}
