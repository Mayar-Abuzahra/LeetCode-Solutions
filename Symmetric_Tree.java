/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && root.right != null) {
            return isSymmetricMirror(root.left, root.right);   
        }
        else if(root.left == null && root.right == null)
         return true;
        return false;
    }

    public boolean isSymmetricMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return (left.val == right.val) && 
               isSymmetricMirror(left.left, right.right) && 
               isSymmetricMirror(left.right, right.left);
    }
}