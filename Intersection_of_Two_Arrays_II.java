class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            int val1 = entry.getValue();
            if (map2.containsKey(key)) {
                int val2 = map2.get(key);
                int min_freq = Math.min(val1, val2);
                for (int i = 0; i < min_freq; i++) {
                    result.add(key);
                }
            }
        }
        
        int[] res_array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
           res_array[i] = result.get(i);
        }
        return res_array;   
    }
}