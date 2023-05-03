class Solution {
    public void sortColors(int[] nums) {
      insertion_sort(nums);
    }
    
    public void insertion_sort(int[] nums) {
      if (nums.length == 0)
       return;
      int cursor=0, key=0;
      for (int i=1; i<nums.length; i++) {
        key = nums[i];
        cursor=i-1;
        while ((cursor>=0) && (nums[cursor]>key)) {
          nums[cursor+1] = nums[cursor];
          cursor--;
        }
        nums[cursor+1] = key;
      }
    }
}