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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp=new ListNode(0);
        ListNode x1=temp;
        int carry=0;
        while(l1!=null||l2!=null)
        {
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            ListNode curr=new ListNode(sum%10);
            carry=sum/10;
            temp.next=curr;
            temp=temp.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
        }
        if(carry==1)
        {
           ListNode curr=new ListNode(carry); 
            temp.next=curr;
        }
        return x1.next;
        
}
}
