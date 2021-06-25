        q.add(root);
        while(!q.isEmpty())
        {
            int x=q.size();
            int sum=0;
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
              sum=sum+temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            lis.add(sum);
            
        }
        System.out.print(lis);
        
        return lis.get(lis.size()-1);
    }
}
