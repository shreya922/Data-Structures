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
class CBTInserter {
TreeNode head=null;
    public CBTInserter(TreeNode root) {
        head=root;
    }
    
    public int insert(int v) {
        TreeNode newnode= insertNode(head,v);
        return newnode.val;
    }
    public TreeNode insertNode(TreeNode root,int v)
    {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
           if(root==null)
            return new TreeNode(v);
        while(!q.isEmpty())
        {
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
            if(temp.left!=null)
            q.add(temp.left);
                else
                {
                    temp.left=new TreeNode(v);
                    return temp;
                }
             if(temp.right!=null)
            q.add(temp.right);
                 else
                {
                    temp.right=new TreeNode(v);
                    return temp;
                }
            }
        }
        return null; //no use it will return before head from temp;
        
    }
    public TreeNode get_root() {
        return head;
    }
}
​
/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
