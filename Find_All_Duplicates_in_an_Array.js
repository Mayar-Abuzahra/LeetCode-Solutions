/**
 * Returns an array of all the elements in the input array that appear more than once.
 * @param {number[]} nums - An array of integers.
 * @return {number[]} - An array of integers that appear more than once.
 */
function findDuplicates(nums) {
  const duplicates = [];

  // Compare each element with all the elements that come after it.
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] === nums[j]) {
        duplicates.push(nums[i]);
        break; // Once a duplicate is found, move on to the next element.
      }
    }
  }

  return duplicates.sort();
}