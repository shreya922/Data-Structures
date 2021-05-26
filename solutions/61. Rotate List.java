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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        if(k==0)
            return head;
        ListNode temp=head;
        int count=0;
       while(temp!=null)
       {
           temp=temp.next;
           count++;
       }
        if(count==k)
            return head;
        while(count<=k)
            k=k-count;
        if(k==0)
            return head;
        System.out.print(k);
        int n=count-k-1;
        temp=head;
        while(n!=0)
        {
            temp=temp.next;
            n--;
        }
        ListNode last=temp.next;
        ListNode first=last;
        temp.next=null;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=head;
        head=first;
        return head;
    }
}
