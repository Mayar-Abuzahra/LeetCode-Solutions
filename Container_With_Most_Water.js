/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
  let max_area = 0, temp_cal=0
  let left = 0;
  let right = height.length - 1;
  while (left < right) {
    temp_cal = (Math.min(height[left], height[right])) * (right - left);
    max_area = Math.max(max_area, temp_cal);
    if (height[left] < height[right]){
      left++;
    }else{
      right--;
    }
  }
  return max_area;
};