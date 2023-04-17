class Solution {
    public int[] evenOddBit(int n) {
       int countEven=0, countOdd=0;
       int[] result=new int[2];
       StringBuilder binary = new StringBuilder(Integer.toBinaryString(n)).reverse();
       
       for (int i = 0; i < binary.length(); i++) {
            if((i)%2 == 0 && binary.charAt(i) == '1')
              countEven++;
            else if((i)%2 != 0 && binary.charAt(i) == '1')
              countOdd++;
        }
       result[0]=countEven;
       result[1]=countOdd;
       return result;
    }
}