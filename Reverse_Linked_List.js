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
var reverseList = function(head) {
  let pointer = head; 
  let previous = null, current = null; 
  while (pointer != null) { 
    current = pointer; 
    pointer = pointer.next; 
    current.next = previous; 
    previous = current; 
    head = current; 
  }
  return head
};