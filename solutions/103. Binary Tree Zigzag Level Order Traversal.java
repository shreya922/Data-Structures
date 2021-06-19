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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
         List<List<Integer>> list1=new ArrayList<List<Integer>>();
           if(root==null)
            return list1;
        int c=0;
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
             List<Integer> listz=new ArrayList<Integer>();
            if(c%2!=0)
            {
             for(int i=list.size()-1;i>=0;i--)
                 listz.add(list.get(i));
                list1.add(listz);
            }
            else
            list1.add(list);
            c++;
        }
        return list1; 
    }
}
