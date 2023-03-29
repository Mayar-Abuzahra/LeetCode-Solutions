/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  if(!nums || nums.length === 0) {
    return 0;
  }  
  let index = 1, flag=0
    for(let i = 1; i < nums.length; i++) {
      if(nums[i] !== nums[i-1]) {
        nums[index++] = nums[i];
        flag=0
      }
      else if((nums[i] === nums[i-1]) && !flag){
        nums[index++] = nums[i];
        flag=1
      }
    }
    
  nums.splice(index, nums.length - index);
  return nums.length;
};