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
    public int maxDepth(TreeNode root) {
        // no node, no depth
        if(root == null){
            return 0;
        }

        // if left and right are both null, only one node
        if(root.left == null && root.right == null){
            return 1;
        }
        // add left depth to this
        int leftDepth = 1;
        if(root.left != null){
            leftDepth =  maxDepth(root.left) + 1;
        }

        // add right depth to this
        int rightDepth = 1;
        if(root.right != null) {
            rightDepth = maxDepth(root.right) + 1;
        }

        // return deeper depth
        return Math.max(leftDepth, rightDepth);
    }
}