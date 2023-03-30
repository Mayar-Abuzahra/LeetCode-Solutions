/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = (head) => {
  let pointer = head;
  let str = "";

  while (pointer && pointer.next) {
    str += String(pointer.val);
    pointer = pointer.next;
  }

  if (pointer) {
    str += String(pointer.val);
  }

  return str === str.split("").reverse().join("");
};