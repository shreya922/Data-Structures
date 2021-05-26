        ListNode temp2=l2;
    
        
        while(temp1!=null)
        {
            first=first*10+temp1.val;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            second=second*10+temp2.val;
            temp2=temp2.next;
        }
     
        
        
        long result=first+second;
        long rev=0;
         System.out.print(result);
        
        ListNode temp=new ListNode();
        ListNode head=temp;
        //result=result/10;
        if(result==0)
        {
            head.val=0;
            return head;
        }
        while(result!=0)
        {
            int j=(int)(result%10);
            temp.next=new ListNode(j);
           temp=temp.next;
            result=result/10;
        }
        return head.next;
        
    }
}
