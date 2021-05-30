        ListNode right=sortList(mid);
        return merge(left,right);
    }
    
    ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode dummyNode=new ListNode(0);
        ListNode ptr=dummyNode;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                ptr.next=list1;
                 list1=list1.next;
                ptr=ptr.next;
               
            }
            else
            {
                 ptr.next=list2;
                   list2=list2.next;
                ptr=ptr.next;
             
            }
        }
        if(list2==null&&list1!=null)
        ptr.next=list1;
        else if(list1==null&&list2!=null)
        ptr.next=list2;
        return dummyNode.next;
    }
    ListNode getMid(ListNode head)
    {
         ListNode slow = head, fast = head,prevslow=null;
        while (fast != null && fast.next != null) {
            prevslow=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
       ListNode x=slow;
        if(prevslow==null)
            return slow;
        else
        {
            prevslow.next=null;
            return x;
        }
    }
}
