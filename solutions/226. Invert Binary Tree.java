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
    int z=0;
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp=q.remove();
            TreeNode x=temp.right;
            temp.right=temp.left;
            temp.left=x;
            if(temp.left!=null)
                q.add(temp.left);
             if(temp.right!=null)
                q.add(temp.right);
        }
        return root;
    }
}
