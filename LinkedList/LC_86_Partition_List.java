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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode node=head;
        ListNode lefth=left;
        ListNode righth=right;
        int c=0;
        while(node!=null){
            if(node.val<x){
                lefth.next=node;
                lefth=lefth.next;
                node=node.next;
            }else{
                righth.next=node;
                righth=righth.next;
                node=node.next;
            }
        }
        righth.next=null;
        lefth.next=right.next;
        return left.next;
    }
}