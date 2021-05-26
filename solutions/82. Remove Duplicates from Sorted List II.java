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
        
        ListNode curr=head;
        ListNode prev=curr;
        Boolean flag=false;
        while(curr!=null)
        {
            
            ListNode x=curr.next;
          while(x!=null&&curr.val==x.val)
          {
             x=x.next; 
              flag=true;
          }
            if(flag==false)
            {
            prev=curr;
            }
            curr=curr.next;
            if(prev==head&&flag==true&&prev.val==prev.next.val)
            {
                head=x;
                prev=x;
            }
            else
            {
            prev.next=x;
            }
            curr=x;
            flag=false;
        }
         
        return head;
    }
}
