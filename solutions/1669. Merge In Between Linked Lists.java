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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1,temp2=list1;
        int count1=1,count2=-1;
        while(count1!=a)
        {
           temp1=temp1.next;
            count1++;
        }
        while(count2!=b)
        {
            temp2=temp2.next;
            count2++;
        }
        System.out.print(temp1.val+" "+temp2.val);
        temp1.next=list2;
        ListNode x=list2;
        while(x.next!=null)
        {
            x=x.next;
        }
        x.next=temp2;
        return list1;
        
    }
}
