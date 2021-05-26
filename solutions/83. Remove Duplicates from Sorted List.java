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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        int first=head.val;
        ListNode firstp=head;
        ListNode temp=head;
        while(temp!=null)
        {
            int x=temp.val;
            if(x!=first)
            {
                firstp.next=temp;
                first=x;
                firstp=temp;
            }
            temp=temp.next;
        }
         firstp.next=temp;
        return head;
    }
}
