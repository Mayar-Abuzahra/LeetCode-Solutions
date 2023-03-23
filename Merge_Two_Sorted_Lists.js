/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    if(list1 == null && list2 == null)
      return list1
    if(list1 == null && list2 != null)
      return list2
    if(list2 == null && list1 != null)
      return list1

    let out_ll = new ListNode(-198)
    let head = out_ll
    while(list1 != null && list2 != null){
      if(list1.val < list2.val){
        let newNode = new ListNode(list1.val)
        out_ll.next = newNode
        list1 = list1.next
      }
      else{
        let newNode = new ListNode(list2.val)
        out_ll.next = newNode
        list2 = list2.next
      }
      out_ll = out_ll.next
    }
    //if there are more nodes either in list1 or list2
    if(list1 != null)
      out_ll.next = list1
    else if(list2 != null)
       out_ll.next = list2
    return head.next
};
