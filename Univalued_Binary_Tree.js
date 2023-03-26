/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isUnivalTree = function(root) {
  if (!root) {
    return true;
  } else if (root.left && root.val !== root.left.val) {
    return false;
  } else if (root.right && root.val !== root.right.val) {
    return false;
  } else {
    return isUnivalTree(root.left) && isUnivalTree(root.right);
  }
};