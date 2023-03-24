/**
 * @param {number[]} nums
 * @return {boolean}
 */
 function isIncreasing(nums) {
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] <= nums[i - 1]) {
      return false;
    }
  }
  return true;
}
var canBeIncreasing = function(nums) {
  let removedElement;
  for (let i = 0; i < nums.length; i++) {
    removedElement = nums.splice(i, 1)[0];
    if (isIncreasing(nums)) {
      return true;
    }
    nums.splice(i, 0, removedElement);
  }
  return false;
};