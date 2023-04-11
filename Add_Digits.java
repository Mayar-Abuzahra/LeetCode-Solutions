class Solution {
    public int addDigits(int num) {
    int temp_num = num, sum=0;
    while((temp_num / 10) != 0){
      sum+=temp_num/10;
      sum+=temp_num%10;
      temp_num=sum;
      sum=0;
    }   
    return temp_num;
    }
}