/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
            return null;
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
      
            if(root.val<low||root.val>high)
            {
                root=deleteNode(root,root.val);
                //System.out.print(list.get(i));
            }
        return root;
    }
  
    public TreeNode deleteNode(TreeNode root,int data)
    {
        if(root==null)
            return null;
        else if(root.val<data)
            root.right=deleteNode(root.right,data);
        else if(root.val>data)
           root.left= deleteNode(root.left,data);
        else
        {
            if(root.left!=null&&root.right!=null)
            {
               int maxvalue= max(root.left);
                root.val=maxvalue;
             root.left=deleteNode(root.left,maxvalue);
                return root;
            }
             if(root.left!=null)
                return root.left;
              if(root.right!=null)
                return root.right;
            else
                return null;
            
        }
        return root;
    }
    public int max(TreeNode root)
    {
        if(root.right!=null)
            return max(root.right);
        else
            return root.val;
    }
}
