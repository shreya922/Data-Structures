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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list1=new ArrayList<List<Integer>>();
          List<Double> d1=new ArrayList<Double>();
        if(root==null)
            return d1;
       Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<Integer>();
            int x=q.size();
            for(int i=0;i<x;i++)
            {
                TreeNode temp=q.remove();
                list.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            list1.add(list);
        }
        List<Double> d=new ArrayList<Double>();
        for(int i=0;i<list1.size();i++)
        {
