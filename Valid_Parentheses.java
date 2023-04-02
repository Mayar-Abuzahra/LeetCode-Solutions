import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      char top;

      for(int i = 0; i < s.length(); i++){
       if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
        stack.push(s.charAt(i));
       else if (!stack.isEmpty()){
        top=stack.peek();
        if(top=='(' && s.charAt(i)==')' || top=='[' && s.charAt(i)==']' || top=='{' && s.charAt(i)=='}'){
          stack.pop();
        } 
        else
         return false;
       }
       else
        return false;
      }

      return stack.isEmpty();
    }
}