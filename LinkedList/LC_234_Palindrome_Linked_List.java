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
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int[] arr=new int[c];
        curr=head;
        for(int i=0; i<c; i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        int i=0, j=c-1;
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
