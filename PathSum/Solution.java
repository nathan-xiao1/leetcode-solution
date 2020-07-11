/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return traverse(root, sum, 0);
    }
    
    public boolean traverse(TreeNode node, int sum, int currentSum) {
        if (node == null) return false;
        currentSum += node.val;
        if (currentSum == sum && node.left == null && node.right == null) return true;
        return traverse(node.left, sum, currentSum) || traverse(node.right, sum, currentSum);
    }
    
}
