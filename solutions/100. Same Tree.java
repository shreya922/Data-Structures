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
    public boolean isSameTree(TreeNode root, TreeNode roo1) {
        List<List<Integer>> list1=found(root);
         List<List<Integer>> list2=found(roo1);
        System.out.print(list1+" "+list2);
        return list1.equals(list2);
    }
    public List<List<Integer>> found (TreeNode root)
    {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> lis=new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty())
        {
            lis=new ArrayList<Integer>();
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
