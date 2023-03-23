/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
  if((head===null) || (head.next===null))
    return head
  let first_node = head
  let second_node = head.next
  let temp_node=swapPairs(second_node.next)
  first_node.next=temp_node
  second_node.next=first_node
  return second_node
};
