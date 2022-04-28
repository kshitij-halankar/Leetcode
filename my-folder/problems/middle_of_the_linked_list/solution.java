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
    public ListNode middleNode(ListNode head) {
        int [] list = new int[100];
        int c = 0;
        while(head != null){
            list[c] = head.val;
            head = head.next;
            c++;
        }
        ListNode h = null;
        ListNode t = null;
        int i = 0;
        for(i = c-1; i >= c/2; i--) {
            if(t == null) {
                     t = new ListNode(list[i], null);
                 } else {
                     h = t;
                     t = new ListNode(list[i], h);
                 }
        }
        return t;
    }
}