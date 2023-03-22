/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
  let j=nums.length-1, count=0;
  for (let i = 0; i < nums.length; i++) {
    while(j>i){
      if((nums[i] === nums[j]) && (i < j))
        count++
      j--
    }
    j=nums.length-1
  }
  return count
};