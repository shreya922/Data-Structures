        while(!q.isEmpty())
        {
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
                if(temp.left!=null)
                {
                q.add(temp.left);
                    if(temp.left.left==null&&temp.left.right==null)
                        sum=sum+temp.left.val;
                }
                if(temp.right!=null)
                q.add(temp.right);
            }
            
        }
        return sum;
    } 
        
        
    }
​
