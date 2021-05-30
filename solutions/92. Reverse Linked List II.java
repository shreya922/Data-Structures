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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;
         int x=1,y=1;
        ListNode curr1=head;
        ListNode curr2=head;
        ListNode yz=null;
        while(x!=left)
        {
            yz=curr1;
           curr1=curr1.next; 
            x++;
        }
        ListNode start=curr1;
         while(y!=right)
        {
           curr2=curr2.next; 
             y++;
        }
        ListNode end=curr2.next;
        ListNode prev=curr1,curr=curr1.next,next1=null;
        while(curr!=end)
        {
           if(prev==head)
               prev.next=null;
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        if(curr2.next!=null)
        {
        start.next=end;
        }
        else
        {
           start.next=null; 
        }
        if(start==head)
        {
            head=curr2;
        }
        else
        {
            yz.next=curr2;
        }
        return head;
        
    }
}
