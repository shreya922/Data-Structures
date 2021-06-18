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
    public TreeNode increasingBST(TreeNode root) {
       ArrayList<Integer> list=new ArrayList<Integer>();
        TreeNode rootz=null;
          TreeNode head=new TreeNode();
        
       list= inorder(root,list); 
        System.out.print(list);
        for(int i=0;i<list.size();i++)
        {
            if(rootz==null)
            {
                rootz=new TreeNode(list.get(i));
                head=rootz;
            }
            else
            {
                rootz.right=new TreeNode(list.get(i));
                rootz=rootz.right;
            }
        }
        return head;
    }
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list)
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
