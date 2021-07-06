            if(temp.left!=null)
            q.add(temp.left);
               else if(temp.left==null&&temp.right!=null)
                    q.add(null);
             if(temp.right!=null)
            q.add(temp.right);
              else if(temp.right==null&&temp.left!=null)
                    q.add(null);
            }
            list1.add(list);
        }
       Boolean flag=false;
        for(int i=0;i<list1.size();i++)
        {
                if(list1.get(i).contains(x1)&&list1.get(i).contains(y))
                {
                    flag=true;
                   int temp1=list1.get(i).indexOf(x1);
                     int temp2=list1.get(i).indexOf(y);
                    if((temp1==(temp2+1)&&temp2%2==0)||(temp2==(temp1+1)&&temp1%2==0))
                    return false;
                }
            
        }
        if(flag==true)
        return true;
          return false;        
         
    }
}
