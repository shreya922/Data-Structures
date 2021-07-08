        {
            int x=q.size();
            List<TreeNode> list=new ArrayList<TreeNode>();
            for(int i=0;i<x;i++)
            {
                TreeNode temp=q.remove();
                list.add(temp);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            list1.add(list);
        }
        List<TreeNode> last=new ArrayList(list1.get(list1.size()-1));
       if(last.size()==1)
           return last.get(0);
        TreeNode p1=last.get(0);
          TreeNode q1=last.get(1);
        System.out.print(root.val+" "+p1.val+" "+q1.val);
        TreeNode y= lca(root,p1,q1);
        for(int i=2;i<last.size();i++)
         y=lca(root,y,last.get(i));
        return y;
    }
    public TreeNode lca(TreeNode root,TreeNode p1,TreeNode q1)
    {
        if(root==null)
           return null;
        if(root==p1||root==q1)
            return root;
        TreeNode left=lca(root.left,p1,q1);
        TreeNode right=lca(root.right,p1,q1);
        if(left!=null&&right!=null)
            return root;
        if(left!=null)
            return left;
        else
        return right;
    }
}
