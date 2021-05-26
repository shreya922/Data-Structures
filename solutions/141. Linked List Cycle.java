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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        LinkedHashSet<ListNode> set=new LinkedHashSet<ListNode>();
        while(temp!=null)
        {
            if(!set.add(temp))
                return true;
            temp=temp.next;
        }
        return false;
    }
}
