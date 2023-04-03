import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                map.remove(nums[i]);
            }
        }

        if (map.size() == 1) {
            return map.keySet().iterator().next();
        } else {
            return -1;
        }
    }
}