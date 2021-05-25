/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            if(prev==head)
                prev.next=null;
            ListNode next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        head=prev;
        return head;
    }
}
