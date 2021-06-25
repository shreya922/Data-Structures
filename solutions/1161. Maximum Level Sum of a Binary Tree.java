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
    public int maxLevelSum(TreeNode root) {
       List<List<Integer>> list=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> lis=new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty())
        {
            int x=q.size();
            int sum=0;
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
              sum=sum+temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            lis.add(sum);
            
        }
        int ans=0,max=Integer.MIN_VALUE;
        for(int i=lis.size()-1;i>=0;i--)
        {
