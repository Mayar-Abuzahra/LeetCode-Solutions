class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor_result = 0;
        int and_result = 0;
        
        for (int i = 0; i < arr2.length; i++) {
            and_result ^= arr2[i];
        }
        
        for (int i = 0; i < arr1.length; i++) {
            xor_result ^= (arr1[i] & and_result);
        }
        
        return xor_result;
    }
}