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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null)
            return null;
          TreeNode node=new TreeNode(val);
        if(root.val<val)
        {
            node.left=root;
            return node;
        }
        TreeNode current=root;
        while(current.right!=null&&current.right.val>val)
        {
            current=current.right;
        }
        if(current.right==null)
        {
            current.right=node;
            return root;
        }
        else
        {
            node.left=current.right;
            current.right=node;
            return root;
         }
}
}
