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
    public TreeNode bstFromPreorder(int[] preorder) {
      return insert(preorder);
    }
    public TreeNode insert(int[] preorder)
    {
        TreeNode root=new TreeNode(preorder[0]);
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        for(int i=1;i<preorder.length;i++)
        {
            int data=preorder[i];
           if(!st.isEmpty()&&st.peek().val>data)
        {
            st.peek().left=new TreeNode(data);
            st.push(st.peek().left);
        }
        else
        {
            TreeNode temp=null;
            while(!st.isEmpty()&&st.peek().val<data)
            {
                temp=st.pop();
            }
            temp.right=new TreeNode(data);
            st.push(temp.right);
        }
        }
        return root;
    }
    
   
}
