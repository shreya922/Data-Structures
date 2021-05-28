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
    public ListNode oddEvenList(ListNode head) {
      ListNode temp=head;
        if(head==null)
            return head;
        ListNode prev=null;
        ListNode newnode=null;
        ListNode even=new ListNode(0);
         ListNode evenhead=even;
        int count=0;
        while(temp!=null)
        {
            
          if(count%2!=0)
          {
              if(temp==head)
              {
                  newnode=head;
                  head=head.next;
                  temp=head;
                   newnode.next=null;
              }
              else
              {
