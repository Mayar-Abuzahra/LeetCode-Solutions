/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(!nums || nums.length === 0) {
      return 0;
    }
    
    let index = 1;
    for(let i = 1; i < nums.length; i++) {
      if(nums[i] !== nums[i-1]) {
        nums[index++] = nums[i];
      }
    }
    
    nums.splice(index, nums.length - index);
    return nums.length;
};