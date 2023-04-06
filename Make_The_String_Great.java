class Solution {
    public String makeGood(String s) {
      Stack<Character> stack = new Stack<>();
      char top;

      for(int i = 0; i < s.length(); i++){
       if(!stack.isEmpty()){
          top=stack.peek();
        if((Character.isUpperCase(top)&&Character.toLowerCase(top)==s.charAt(i)) ||
            (Character.isUpperCase(s.charAt(i))&&Character.toLowerCase(s.charAt(i))==top))
          stack.pop();
        else
          stack.push(s.charAt(i));
       }
        else
          stack.push(s.charAt(i));
      }

      StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
          sb.append(stack.pop());
        }
      return sb.reverse().toString();
    }
}
