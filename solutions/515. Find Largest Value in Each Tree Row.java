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
    public List<Integer> largestValues(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        List<Integer> f=new ArrayList<Integer>();
           if(root==null)
            return f;
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<Integer>();
            int x=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
                if(temp.val>max)
                    max=temp.val;
            list.add(temp.val);   
            if(temp.left!=null)
            q.add(temp.left);
             if(temp.right!=null)
            q.add(temp.right);
            }
            f.add(max);
        }
        return f;
    }
}
