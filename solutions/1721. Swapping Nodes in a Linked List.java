        {
            prev1=temp1;
            temp1=temp1.next;
            f++;
        }
         n=l-k;
        f=0;
        ListNode temp2=head;
        ListNode prev2=new ListNode(-1500);
         while(temp2!=null&&f!=n)
        {
            prev2=temp2;
            temp2=temp2.next;
            f++;
        }
        if(temp1.next==temp2)
        {
            if(temp1==head)
                head=temp2;
            else if(temp2==head)
                head=temp1;
            ListNode x=temp2.next;
          prev1.next=temp2;
            temp2.next=temp1;
            temp1.next=x;
            
        }
        else if(temp2.next==temp1)
        {
            if(temp1==head)
                head=temp2;
            else if(temp2==head)
                head=temp1;
            ListNode x=temp1.next;
          prev2.next=temp1;
            temp1.next=temp2;
            temp2.next=x;
            
        }
      else{
          if(temp1==head)
                head=temp2;
            else if(temp2==head)
                head=temp1;
         ListNode e=temp2.next;
          if(prev1.val!=-1500)
        prev1.next=temp2;
              
        temp2.next=temp1.next;
        prev2.next=temp1;
        temp1.next=e;
      }
        return head;
    }
}
