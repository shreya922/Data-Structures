 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode temp=head;
      
        ListNode dummyNode=new ListNode(0);
         ListNode e=dummyNode;
        while(temp!=null)
        {
            e.next=new ListNode(temp.val);
            e=e.next;
            temp=temp.next;
        }
        ListNode reversehead=dummyNode.next;
        ListNode curr=reversehead.next,prev=reversehead,next1=null;
        
        
        
        int count=1;
        while(curr!=null)
        {
            if(prev==reversehead)
                prev.next=null;
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
            count++;
        }
        reversehead=prev;
         e=null;
       System.out.print(count);
        int x=count/2;
        int y=0;
        temp=head;
        while(y!=x)
        {
             e=temp.next;
           temp.next= new ListNode(reversehead.val);
            temp=temp.next;
             y++;
            if(y==x&&count%2==0)
            {
                temp.next=null;
                break;
            }
            else if(y==x&&count%2!=0)
            {
                System.out.print(e.val);
                temp.next=e;
                temp=temp.next;
                temp.next=null;
                break;
            }
            temp.next=e;
           
            temp=temp.next;
            reversehead=reversehead.next;
            
        }
        //System.out.print(temp.val);
        
        
    }
}
