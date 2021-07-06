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
    //dekha h but ye bruteforce h means that hum root ke liye algo chalate h then uske left ko pass karte h fir uske right ko so that recursively pura tree cover ho jaye
    int total=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        findpath(root,targetSum,0);
            pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return total;
    }
    public void findpath(TreeNode root,int targetSum,int curr)
    {
        if(root==null)
            return;
        curr=curr+root.val;
        if(curr==targetSum)
            total++;
        findpath(root.left,targetSum,curr);
         findpath(root.right,targetSum,curr);
    }
}
