/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> x=new ArrayList<>();
        ListNode node=head;
        ListNode e=new ListNode(0);
        while(node!=null){
            if(!x.contains(node)){
                x.add(node);
            }else{
                e=node;
                break;
            }
            node=node.next;
        }
        int pos=0;
        node=head;
        while(node!=null){
            if(node==e){
                return e;
            }
            pos++;
            node=node.next;
        }
        pos=-1;
        return null;
    }
}