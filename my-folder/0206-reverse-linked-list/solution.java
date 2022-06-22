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
    ListNode x=null;
    public ListNode reverseList(ListNode head) {
        while (head != null) {
            x=new ListNode(head.val,x);
            head=head.next;
        }
        return x;
    }
}
