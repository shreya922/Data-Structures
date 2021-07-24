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
    String s="";
    Boolean leftchildnull=false;
    public String tree2str(TreeNode root) {
         inorder(root);
        StringBuilder sb=new StringBuilder(s);
        sb=sb.deleteCharAt(0);
        sb=sb.deleteCharAt(sb.length()-1);
        s=new String(sb);
        return s;
    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        {
            s=s+"("+root.val;
            if(root.left!=null)
            inorder(root.left);
             if(root.left==null)
            {
                leftchildnull=true;
            }
             if(leftchildnull==true&&root.right!=null)
            {
                s=s+"()";
              inorder(root.right);
            }
            else
            {   inorder(root.right);
                
            }
                leftchildnull=false; 
            s=s+")";
        }
       
}
}
