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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode result = new ListNode(0);
        result.next=head;
        ListNode prev=null,current=result,next=null;
        for(int i=0;i<left;i++){
            prev=current;
            current=current.next;
        }
        ListNode prev2=prev,current2=current;
        for(int i=left;i<=right;i++){
            next=current2.next;
            current2.next=prev2;
            prev2=current2;
            current2=next;
        }
        prev.next = prev2;
        current.next = current2;
        return result.next;
    }
}