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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return checkMirror(root.left,root.right);
    }

    /**
        Helper method to traverse left and right side
     */
    public boolean checkMirror(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        
        // when compare, one is null and another is not, it is not symmetric
        if(node1 == null || node2 == null){
            return false;
        }

        return node1.val == node2.val && checkMirror(node1.left, node2.right) && checkMirror(node1.right, node2.left);
    }
}