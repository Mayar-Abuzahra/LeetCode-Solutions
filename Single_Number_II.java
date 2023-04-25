import java.util.Stack;

class Solution {
    public int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> deleted_stack = new Stack<>();

        for (int num : nums) {
            if (stack.contains(num)) {
                stack.remove(Integer.valueOf(num));
                deleted_stack.push(num);
            } else if (!deleted_stack.contains(num)) {
                stack.push(num);
            }
        }

        return stack.pop();
    }
}