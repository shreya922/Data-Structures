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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            root=newRoot;
            return newRoot;
        }
          Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
           if(root==null)
            return null;
        int c=1;
        while(!q.isEmpty())
        {
             int x=q.size();
            if(c==(depth-1))
            {
                for(int i=0;i<x;i++)
                {
                TreeNode temp=q.remove(); 
                TreeNode left=temp.left;
                TreeNode right=temp.right;
                temp.left=new TreeNode(val);
                temp.left.left=left;
                 temp.right=new TreeNode(val);
                temp.right.right=right;
                }
                return root;
            }
           
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove(); 
            if(temp.left!=null)
            q.add(temp.left);
             if(temp.right!=null)
            q.add(temp.right);
            
            }
            c++;
        }
        return root;
        
    }
}
