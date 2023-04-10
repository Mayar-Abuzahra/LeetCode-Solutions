import java.util.Collection;

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                hashMap.put(i, nums[i]);
            }
        }   
        Collection<Integer> values = hashMap.values();
        Integer[] array = values.toArray(new Integer[values.size()]);
        for(int i=0; i<array.length; i++) {
            nums[i] = array[i];
        }
        return values.size();
    }
}