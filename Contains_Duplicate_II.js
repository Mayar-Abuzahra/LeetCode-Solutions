/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    let visited_num = {};
    for (let i = 0; i < nums.length; i++) {
        if ((nums[i] in visited_num) && Math.abs(i - visited_num[nums[i]]) <= k) {
            return true;
        }
        visited_num[nums[i]] = i;
    }
    return false;
};