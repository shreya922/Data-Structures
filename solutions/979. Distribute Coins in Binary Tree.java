class Solution {
    int ans=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }
​
    public int dfs(TreeNode node) {
        if (node == null) 
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        ans=ans+ Math.abs(left) + Math.abs(right); //kitne milenge ya chahiye left and right subtrees se
        return node.val + left + right - 1;   //kitne excess h ya chahiye(after movement from left and right subtree)
    }
}
