            for(int i=0;i<x;i++)
            {
                TreeNode temp=q.remove();
                list.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            list1.add(list);
        }
        List<Integer> last=new ArrayList(list1.get(list1.size()-1));
        //System.out.print(last);
       if(last.size()==1)
           return new TreeNode(last.get(0));
        TreeNode p1=new TreeNode(last.get(0));
          TreeNode q1=new TreeNode(last.get(1));
        System.out.print(root.val+" "+p1.val+" "+q1.val);
        TreeNode y= lca(root,p1.val,q1.val);
        for(int i=2;i<last.size();i++)
         y=lca(root,y.val,last.get(i));
        return y;
    }
    public TreeNode lca(TreeNode root,int p1,int q1)
    {
        if(root==null)
           return null;
        if(root.val==p1||root.val==q1)
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
