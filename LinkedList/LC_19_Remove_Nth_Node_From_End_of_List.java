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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        if(c==n){
            return head.next;
        }
        curr=head;
        for(int i=1; i<c-n; i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}