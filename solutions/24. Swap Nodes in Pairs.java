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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        ListNode prev=head;
        if(head==null)
            return head;
        while(temp!=null&&temp.next!=null)
        {
            if(temp==head)
            {
                ListNode x=temp.next;
                prev=x;
                ListNode y=x.next;
                head.next=y;
                x.next=head;
                head=x;
                temp=y;
                prev=prev.next;
            }
            else
            {
                ListNode x=temp.next;
                 ListNode y=x.next;
                prev.next=x;
                x.next=temp;
                temp.next=y;
                prev=x;
                temp=y;
                prev=prev.next;
            }
            
        }
        return head;
    }
}
