class Solution {
    public double findMaxAverage(int[] nums, int k) {
       if (nums.length == 1)
         return (double)nums[0];
       if (nums == null || nums.length == 0 || k <= 0) 
          return 0;
       //sliding window technique
       double max_array_val = Integer.MIN_VALUE, temp_val = 0;
       for (int i = 0; i < nums.length; i++) {
            temp_val += nums[i];
            if (i >= (k - 1)) { 
                max_array_val = Math.max(max_array_val, temp_val/k);
                temp_val -= nums[i - k + 1];
            }
        }
       return max_array_val; 
    }
}