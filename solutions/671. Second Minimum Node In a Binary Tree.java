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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        list=inorder(root,list); 
        Collections.sort(list);
        if(list.size()<=1)
            return -1;
        int min=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>min)
                return list.get(i);
        }
        return -1;
    }
    List<Integer> inorder(TreeNode root,List<Integer> list)
    {
       if(root!=null)
       {
           inorder(root.left,list);
           list.add(root.val);
           inorder(root.right,list);
       }
        return list;
    }
}
