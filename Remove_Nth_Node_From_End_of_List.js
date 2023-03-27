/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
  if(!head.next)
   head=head.next
  else{
    let cursor = head, node_remove_cursor = head, node_previous=head, count = 1;
    while (cursor !== null) {
      cursor = cursor.next;
      if (count > n) {
        node_remove_cursor = node_remove_cursor.next;
      }
      count++;
    }
    while(node_previous.next && node_previous.next !== node_remove_cursor)
     node_previous=node_previous.next
    if (node_remove_cursor === null) { // added check for null
      return head;
    }
    if (node_remove_cursor.next !== null) {
      node_remove_cursor.val = node_remove_cursor.next.val;
      node_remove_cursor.next = node_remove_cursor.next.next;
    } else {
      node_previous.next=null
    }
  }
  return head;
};