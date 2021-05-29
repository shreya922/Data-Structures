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
    public ListNode removeZeroSumSublists(ListNode head) {
      ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode prev=dummyNode;
        ListNode current=head;
        ListNode checkNode=null;
        while(current!=null)
        {
            checkNode=current;
            ListNode end=CheckSum(checkNode);
            if(end!=null)
            {
                prev.next=end.next;
                current=end.next;
                
            }
            else
            {
            prev=current;
                current=current.next;
            }
            
        }
        return dummyNode.next;
    }
    public ListNode CheckSum(ListNode start)
    {
        int sum=0;
        while(start!=null)
        {
            sum=sum+start.val;
           
            if(sum==0)
                return start;
             start=start.next;
        }
        return null;
    }
}
