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
    public ListNode mergeNodes(ListNode head) {
        ListNode x = new ListNode();
        ListNode z = x;
        int c=0;
        head=head.next;
        while(head!=null){
            if(head.val == 0 && c != 0){
                x.next=new ListNode(c);
                x=x.next;
                c=0;
            } else{
                c+=head.val;
            }
            head=head.next;
        }
        return z.next;
    }
}
