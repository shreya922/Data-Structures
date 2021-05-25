        ListNode head=new ListNode();
        ListNode temp=head;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
                ListNode nw=new ListNode(l1.val);
                if(head==null)
                head=nw;
                else
                {
                   temp=head;
                    while(temp.next!=null)
                        temp=temp.next;
                    temp.next=nw;
                    temp=temp.next;
                }
                l1=l1.next;
            }
            else
            {
               ListNode nw=new ListNode(l2.val);
                if(head==null)
                head=nw;
                else
                {
                   temp=head;
                    while(temp.next!=null)
                        temp=temp.next;
                    temp.next=nw;
                    temp=temp.next;
                }
                l2=l2.next;
            }
        }
        
        if(l1==null&&l2!=null)
            temp.next=l2;
        else if(l2==null&&l1!=null)
             temp.next=l1;
        return head.next;
        
        
    }
}
