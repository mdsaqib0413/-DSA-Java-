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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode(0);
        ListNode dum=res;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                dum.next=new ListNode(list1.val);
                list1=list1.next;
            }else{
                dum.next=new ListNode(list2.val);
                list2=list2.next;
            }
            dum=dum.next;
        }
        while(list1!=null){
            dum.next=new ListNode(list1.val);
            list1=list1.next;
            dum=dum.next;
        }
        while(list2!=null){
            dum.next=new ListNode(list2.val);
            list2=list2.next;
            dum=dum.next;
        }
        return res.next;
    }
}