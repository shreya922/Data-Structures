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
class BSTIterator {
List<TreeNode> list=new ArrayList<TreeNode>();
    int i=0;
    public BSTIterator(TreeNode root) {
        wrapper(root);
    }
    public void wrapper(TreeNode root)
    {
        if(root!=null)
        {
            wrapper(root.left);
            list.add(root);
            wrapper(root.right);
        }
    }
    
    public int next() {
        return list.get(i++).val;
    }
    
    public boolean hasNext() {
        if(i<list.size())
            return true;
        return false;
    }
}
​
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
