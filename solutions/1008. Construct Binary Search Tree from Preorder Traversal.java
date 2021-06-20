 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
      return insert(preorder);
    }
    public TreeNode insert(int[] preorder)
    {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
          root=createTree(root,preorder[i]);
        }
        return root;
    }
    public TreeNode createTree(TreeNode root,int data)
    {
        if(root==null)
        {
            root=new TreeNode(data);
            return root;
        }
        if(root.val<data)
            root.right=createTree(root.right,data);
         if(root.val>data)
            root.left=createTree(root.left,data);
        return root;
    }
   
}
