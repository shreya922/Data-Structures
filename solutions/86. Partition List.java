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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)
            return head;
        ListNode tempz=head,prev1=null;
        while(tempz!=null)
        {
            if(tempz.val>=x)
            {
            break;
            }
            tempz=tempz.next;
        }
         ListNode temp=head,prev=null;
     
        ListNode dummyNode=new ListNode(0);
        ListNode e=dummyNode;
       
        while(temp!=null)
        {
            if(temp.val<x)
            {
                e.next=temp;
                e=e.next;
                if(prev!=null)
                {
                    prev.next=temp.next;
                     temp=temp.next;
                }
                else
                {
                    temp=head.next;
                    head=temp;
                }
            }
            else
            {
            prev=temp;
           temp=temp.next;
            } 
        }
          e.next=tempz;
            head=dummyNode.next;
        return head;
    }
}
