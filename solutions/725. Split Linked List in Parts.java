            count++;
            temp=temp.next;
            
        }
        int[] arr=new int[k];
        if(count<k)
        {
            for(int i=0;i<count;i++)
                arr[f++]=1;
            for(int i=0;i<k-count;i++)
                arr[f++]=0;
        }
        else
        {
        int a=count%k;
        //System.out.print(a);
        f=0;
        int h=k;
        while(a!=0||h!=0)
        {
            if(a!=0)
            {
           arr[f++]=(count/k)+1;
                 a--;
            }
            else
            {
                arr[f++]=count/k;
            }
           
            h--;
        }
        }
       
        int g=0;
          int x=0;
        f=0;
        int y=0;
        
            y=k;
        
            temp=root;
            while(y!=0)
            {
                x=arr[g++];
                    ListNode dummyNode=new ListNode(0);
                ListNode e=dummyNode;
            while(x!=0)
            {
        
            
            e.next=temp;
            e=e.next;
            temp=temp.next;
                if(x==1)
                  e.next=null;  
                x--;
            }
            
                result[f++]=dummyNode.next;
                y--;
            }
            
        
        
        return result;
    }
}
