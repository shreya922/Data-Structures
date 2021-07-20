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
        int L = dfs(node.left);
        int R = dfs(node.right);
        ans=ans+ Math.abs(L) + Math.abs(R); //kitne milenge ya chahiye left and right subtrees se
        return node.val + L + R - 1;   //kitne excess h ya chahiye
    }
}
