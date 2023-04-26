import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))  
            return "0";
        BigInteger first_num = new BigInteger(num1);
        BigInteger second_num = new BigInteger(num2);
        BigInteger result = first_num.multiply(second_num);
        return result.toString();
    }
}