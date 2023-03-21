/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
  nums.sort((a, b) => a - b); // sort the array in non-descending order
  let result = [];
  for(let i=0; i<nums.length-2; i++){
    if(i === 0 || (i > 0 && nums[i] !== nums[i-1])){ // skip duplicate numbers
      let left = i+1, right = nums.length-1;
      while(left < right){
        let sum = nums[i] + nums[left] + nums[right];
        if(sum === 0){
          result.push([nums[i], nums[left], nums[right]]);
          while(left < right && nums[left] === nums[left+1]) left++; // skip duplicate numbers
          while(left < right && nums[right] === nums[right-1]) right--; // skip duplicate numbers
          left++;
          right--;
        } else if(sum < 0){
          left++;
        } else {
          right--;
        }
      }
    }
  }
  return result;
};
