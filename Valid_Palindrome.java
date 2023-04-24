class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
      StringBuilder reversed = new StringBuilder(s).reverse();
      return s.equals(reversed.toString());
    }
}