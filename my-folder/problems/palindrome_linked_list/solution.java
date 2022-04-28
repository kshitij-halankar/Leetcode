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
    public boolean isPalindrome(ListNode head) {
        int[] k = new int[100000];
        int c = 0;
        while(head != null) {
            k[c] = head.val;
            head = head.next;
            c++;
        }
        int i = 0;
        int n = 0;
        for(i = 0; i < c/2; i++) {
            if(k[i] == k[c-i-1]) {
                n++;
            }
        }
        return n==(c/2);
    }
}