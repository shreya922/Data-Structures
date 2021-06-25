                    return false;
                else
              lis.add(temp.val);
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            l++;
            list.add(lis);
            
        }
        System.out.print(list);
        for(int i=0;i<list.size();i++)
        {
           for(int j=0;j<list.get(i).size()-1;j++)
           {
               if(i%2==0&&list.get(i).get(j)>=list.get(i).get(j+1))
                   return false;
               else if(i%2!=0&&list.get(i).get(j)<=list.get(i).get(j+1))
                   return false;
           }
        }
        return true;
    }
}
