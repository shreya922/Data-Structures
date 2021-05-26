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
    public boolean isPalindrome(ListNode head) {
        ListNode val=new ListNode(0);
        ListNode f=val;
        ListNode x=head;
        while(x!=null)
        {
             // val.next=val;
            ListNode newz=new ListNode(x.val);
          val.next=newz;
            val=val.next;
            x=x.next;
        }
        ListNode e=f.next;
       ListNode prev=head;
        ListNode curr=head.next;
        ListNode next1=head;
        while(curr!=null)
        {
            if(prev==head)
            {
                prev.next=null;
                
            }
            next1=curr.next;
             curr.next=prev;
            prev=curr;
           
            curr=next1;
        }
        head=prev;
       
       while(e!=null&&head!=null)
       {
           if(e.val!=head.val)
               return false;
           e=e.next;
           head=head.next;
       }
        if(e==null&&head==null)
        return true;
        return false;
    }
}
