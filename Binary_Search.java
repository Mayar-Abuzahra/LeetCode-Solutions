class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int min = 0, max = nums.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}