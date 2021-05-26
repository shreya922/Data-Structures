/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        ListNode res=null;
        LinkedHashSet<ListNode> set=new LinkedHashSet<ListNode>();
        while(temp!=null)
        {
            if(!set.add(temp))
            {
                res=temp;
                break;
            }
            temp=temp.next;
        }
       return res;
        
    }
}
