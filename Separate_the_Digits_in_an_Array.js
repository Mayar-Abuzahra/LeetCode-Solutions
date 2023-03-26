/**
 * @param {number[]} nums
 * @return {number[]}
 */
var separateDigits = function(nums) {
  let res_list = [];
  for (let i = 0; i < nums.length; i++) {
    if (nums[i].toString().length === 1) {
      res_list.push(nums[i]);
    } else {
      let digits = nums[i].toString().split("").map(Number);
      res_list = res_list.concat(digits);
    }
  }
  return res_list;
};