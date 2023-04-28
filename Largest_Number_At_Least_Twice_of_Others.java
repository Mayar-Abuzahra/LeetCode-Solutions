class Solution {
    public int dominantIndex(int[] nums) {
        int max_val = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_val) {
                max_val = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if ((i != index) && (max_val < (nums[i] * 2))) {
                return -1;
            }
        }
        return index;
    }
}