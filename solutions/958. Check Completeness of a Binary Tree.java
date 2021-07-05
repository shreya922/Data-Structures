             if(temp.right!=null)
            q.add(temp.right);
               else
                    q.add(null);
            }
            list1.add(list);
        }
        System.out.print(list1); 
        int x=1;
         Boolean z=false;
         for(int i=0;i<list1.get(list1.size()-1).size();i++)
        {
            if(list1.get(list1.size()-1).get(i)!=null)
            {
                z=true;
            }
        }
        for(int i=0;i<list1.size()-2;i++)
        {
            if(list1.get(i).size()!=x)
            {
                 System.out.print("from here1");
                return false;
                
            }
            x=x*2;
            for(int j=0;j<list1.get(i).size();j++)
            {
                if(list1.get(i).get(j)==null)
                {
                    System.out.print("from here2");
                    return false;
                }
            }
                
        }
       
        if(z==true)
        {
        for(int i=0;i<list1.get(list1.size()-1).size();i++)
        {
            if(list1.get(list1.size()-1).get(i)==null)
            {
                for(int j=i+1;j<list1.get(list1.size()-1).size();j++)
                    if(list1.get(list1.size()-1).get(j)!=null)
                    {
                       System.out.print("from here3");
                        return false;
                        
                    }
            }
        }
        }
        else
        {
         for(int i=0;i<list1.get(list1.size()-2).size();i++)
        {
            if(list1.get(list1.size()-2).get(i)==null)
            {
                for(int j=i+1;j<list1.get(list1.size()-2).size();j++)
                    if(list1.get(list1.size()-2).get(j)!=null)
                    {
                           System.out.print("from here4");
                        return false;
                    }
            }
        }   
        }
        return true;
    }
}
