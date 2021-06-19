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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list1=new ArrayList<List<Integer>>();
        if(root==null)
            return list1;
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
        List<List<Integer>> list2=new ArrayList<List<Integer>>();
        for(int i=list1.size()-1;i>=0;i--)
        {
          list2.add(list1.get(i));
        }
        return list2;
    }
}
