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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    List<Integer> list=new ArrayList<Integer>();
    list= inorder(root1,list);
    List<Integer> list1=new ArrayList<Integer>();
    list1= inorder(root2,list1);
        list.addAll(list1);
        Collections.sort(list);
        return list;
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
