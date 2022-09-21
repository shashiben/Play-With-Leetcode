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
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return null;
        }
        int len=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                len=getCycleLength(slow);
               break;
            }
        }
        if(len==0){
            return null;
        }
        ListNode left=head;
        ListNode start=head;
        while(len>0){
            start=start.next;
            len--;
        }
        while(left!=start){
            left=left.next;
            start=start.next;
        }
        return left;
    }
    int getCycleLength(ListNode slow){
        int count=0;
        ListNode temp=slow;
        do{
            temp=temp.next;
            count++;
        }while(temp!=slow);
        return count;
    }
}