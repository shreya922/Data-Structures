        {
            temp=temp.left;
            leftz++;
        }
        temp=root;
        while(temp!=null)
        {
            temp=temp.right;
            rightz++;
        }
        if(leftz!=rightz)
            return false;
       List<Integer> list1=new ArrayList<Integer>(); 
         List<Integer> list2=new ArrayList<Integer>(); 
        list1=found(root,list1);
         list2=foundz(root,list2);
        System.out.print(list1+" "+list2);
        return list1.equals(list2);
    }
    public List<Integer> found(TreeNode root,List<Integer> list)
    {
         if(root.left!=null||root.right!=null)
       {
           
             if(root.left!=null)
             found(root.left,list);
             else
                 list.add(null);
            // if(root.left==null)
             list.add(root.val);
             if(root.right!=null)
             found(root.right,list);
             else
                 list.add(null);
       }
        if(root.left==null&&root.right==null)
        {
        list.add(root.val);
        }
        return list;
    }
    public List<Integer> foundz(TreeNode root,List<Integer> list)
    {
         if(root.left!=null||root.right!=null)
       {
           
             if(root.right!=null)
             foundz(root.right,list);
             else
                 list.add(null);
            // if(root.left==null)
             list.add(root.val);
             if(root.left!=null)
             foundz(root.left,list);
             else
                 list.add(null);
       }
        if(root.left==null&&root.right==null)
        {
        list.add(root.val);
        }
        return list;
    }
}
