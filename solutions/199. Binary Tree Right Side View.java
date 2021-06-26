         List<Integer> list=new ArrayList<Integer>();
         List<List<Integer>> list1=new ArrayList<List<Integer>>();
           if(root==null)
            return list;
        while(!q.isEmpty())
        {
            list=new ArrayList<Integer>();
            int x=q.size();
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
          List<Integer> fz=new ArrayList<Integer>();
        for(int i=0;i<list1.size();i++)
        {
           int j=list1.get(i).size()-1;
              fz.add(list1.get(i).get(j));
        }
        return fz;
    }
}
