/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null)
       return head;
      ListNode temp_current = head;
      ListNode temp_prev = null;
      while (temp_current != null) {
        ListNode temp_next = temp_current.next;
        temp_current.next = temp_prev;
        temp_prev = temp_current;
        temp_current = temp_next;
      }

      return temp_prev;  
    }
}