class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        ArrayList<Integer> evenArrayList = new ArrayList<Integer>();
        ArrayList<Integer> oddArrayList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArrayList.add(nums[i]);
            } else {
                oddArrayList.add(nums[i]);
            }
        }

        // Concatenate the two ArrayLists
        evenArrayList.addAll(oddArrayList);

        // Convert the ArrayList to an array
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < evenArrayList.size(); i++) {
            resultArray[i] = evenArrayList.get(i);
        }

        return resultArray;
    }
}