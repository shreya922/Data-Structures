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
    int i=0;
    List<Integer> list=new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {
      
        list= preorder(root,list);
        Collections.sort(list);
        root=null;
            root=insert(root,0,list.size()-1);
        return root;
    }
    public TreeNode insert(TreeNode root,int start,int end)
    {
        if(start>end)
            return null;
      int mid=(start+end)/2;
            root= new TreeNode(list.get(mid));
        root.left=insert(root,start,mid-1);
        root.right=insert(root,mid+1,end);
        return root;
    }
    List<Integer> preorder(TreeNode root,List<Integer> list)
    {
        if(root!=null)
        {
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }
        return list;
    }
}
