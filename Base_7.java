class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        boolean negative = num < 0 ? true : false;
        num = negative ? -num : num;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % 7;
            sb.append(rem);
            num /= 7;
        }
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}