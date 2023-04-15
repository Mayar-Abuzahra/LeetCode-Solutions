class Solution {
    public int[] countBits(int n) {
      int[] array = new int[n+1];
      int num_ones;
      for (int i = 0; i < array.length; i++) {
        num_ones = Integer.bitCount(i);
        array[i]=num_ones;
      }  
      return array;
    }
}