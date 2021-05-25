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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int x=count-n;
        temp=head;
        if(x==0)
        {
            temp=head.next;
            if(temp!=null)
            {
                head.next=null;
                head=temp;
                return head;
            }
            else
            {
                head=null;
                return head;
                
}
        }
        ListNode prev=head;
        for(int i=1;i<=x;i++)
        {
            temp=temp.next;
           if(i==(x-1))
                prev=temp;
            
        }
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}
