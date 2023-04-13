class Solution {
    public int[] sortedSquares(int[] nums) {
      if(nums.length==0)
       return nums;
      for (int i = 0; i < nums.length; i++) {
        nums[i]*=nums[i];
      }  
      Arrays.sort(nums);
      return nums;
    }
}