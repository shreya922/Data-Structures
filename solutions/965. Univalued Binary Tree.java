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
    public boolean isUnivalTree(TreeNode root) {
       int x=root.val;
        List<Integer> list=new ArrayList<Integer>();
        list= inorder(root,list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=x)
                return false;
        }
        return true;
    }
    public List<Integer> inorder(TreeNode root,List<Integer> list)
    {
        if(root!=null)
        {
            list.add(root.val);
            inorder(root.left,list);
            inorder(root.right,list);
        }
        return list;
    }
}
