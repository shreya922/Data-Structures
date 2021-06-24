        if(root!=null)
        {
           list.add(root.val);
            inorder(root.left,list);
             
            inorder(root.right,list);
        }
        return list;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root=null;
       for(int i=0;i<data.length();i++)
       {
           int num=0;
           while(data.charAt(i)!=' ')
           {
               num=num*10+(data.charAt(i)-48);
               i++;
           }
           root=insert(root,num);
       }
        return root;
    }
    public TreeNode insert(TreeNode root,int data)
    {
        if(root==null)
        {
            root=new TreeNode(data);
            return root;
        }
        else if(root.val>data)
            root.left=insert(root.left,data);
        else if(root.val<data)
            root.right=insert(root.right,data);
        return root;
    }
}
​
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
