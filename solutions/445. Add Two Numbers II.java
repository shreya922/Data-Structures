        l1=prev1;
        
        while(curr2!=null)
        {
            if(prev2==l2)
                prev2.next=null;
            ListNode next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;
        }
        l2=prev2;
        
        int carry=0;
        ListNode dummyNode=null;
        while(l1!=null||l2!=null)
        {
            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int sum=x+y+carry;
            if(dummyNode==null)
            {
                ListNode x1=new ListNode(sum%10);
                dummyNode=x1;
            }
            else
            {
               ListNode x1=new ListNode(sum%10);
                x1.next=dummyNode;
                dummyNode=x1;
            }
           
            carry=sum/10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
        }
        if(carry==1)
        {
            ListNode x1=new ListNode(carry);
            x1.next=dummyNode;
                dummyNode=x1;
        }
        return dummyNode;
    }
}
