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
var deleteDuplicates = function(head) {
    if(!head)
     return null;
    let pointer=head, temp_value=0
    while(pointer && pointer.next !== null){
      temp_value=pointer.next.val
      if(temp_value===pointer.val)
       pointer.next=pointer.next.next
      else
       pointer=pointer.next
    }
    return head;
};