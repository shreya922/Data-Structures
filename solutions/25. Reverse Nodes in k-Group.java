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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==0||k==1)
            return head;
        if(head==null)
            return head;
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
           length++;
            temp=temp.next;
        }
        int times=length/k,traverse=0;
        // x=null;
        //System.out.print(length);
        ListNode curr=head.next,next1=head,prev=head,first=null;
        ListNode x=null,f=null;
        for(int i=1;i<=times;i++)
        {
            traverse=0;
            while(traverse!=k)
            {
              next1=next1.next;
                traverse++;
            }
            System.out.println(next1.val);
            traverse=0;
            //ListNode q=first;
          while(curr!=next1)
          {
              if(traverse==0)
                  first=prev;
             
             if(prev==head)
                 prev.next=null;
              ListNode e=curr.next;
