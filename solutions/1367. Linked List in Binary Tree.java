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
    Boolean flag=false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        ListNode temp=head;
        if(root==null)
            return false;
       if(head.val==root.val)
         if(wrapper(head,root,temp))
             return true;
          return isSubPath(head,root.left)||isSubPath(head,root.right);
        
    }
    public boolean wrapper(ListNode head, TreeNode root,ListNode temp)
    {
        if(root==null&&temp==null)
            return true;
          if(root==null&&temp!=null)
            return false;
        if(temp==null)
            return true;
        if(root.val!=temp.val)
        {
            return false;
        }
        return wrapper(head,root.left,temp.next)|| wrapper(head,root.right,temp.next);
       
    }
}
