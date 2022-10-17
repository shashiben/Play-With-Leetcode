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
        Stack<Integer> stack=new Stack<>();
        ListNode slow=head;
        while(slow!=null){
            stack.push(slow.val);
            slow=slow.next;
        }
        while(head!=null){
            int data=stack.pop();
            if(head.val!=data){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}