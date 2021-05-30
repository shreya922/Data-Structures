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
    public ListNode sortList(ListNode head) {
        if(head==null)
            return head;
     ListNode i=head,j=head,f=head;
        int count=0,n=0,x=0;
        while(f!=null)
        {
           n++; 
            f=f.next;
        }
        f=head;
     while(i!=null)
     {
         j=head;f=head;x=0;
         while(x!=(n-count-1))
        {
            f=f.next;
            x++;
        }
         //System.out.println(f.val);
        while(j!=f)
        {
            if(j.val>j.next.val)
            {
              int temp=j.val;
                j.val=j.next.val;
                j.next.val=temp;
                
            }
            j=j.next;
        }
         i=i.next;
         count++;
     }
        return head;
    }
}
