class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] inter_array = new int[nums1.length];
        int index_array = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && isElementNotInArray(inter_array, nums1[i], index_array)) {
                    inter_array[index_array] = nums1[i];
                    index_array++;
                    break;
                }
            }
        }
        return Arrays.copyOf(inter_array, index_array);
    }
    
    public static boolean isElementNotInArray(int[] arr, int target, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == target) {
                return false;
            }
        }
        return true;
    }
}