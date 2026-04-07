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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode node=head;
        while(node!=null && node.next!=null){
            int t=node.val;
            node.val=node.next.val;
            node.next.val=t;
            node=node.next.next;
        }
        return head;
    }
}