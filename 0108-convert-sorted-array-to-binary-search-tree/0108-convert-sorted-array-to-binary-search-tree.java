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

    public TreeNode constructBST(int[] nums, int left, int right){
        // base condition. 
        if(left > right) return null;

        int middle = (left + right) /2;

        TreeNode root = new TreeNode(nums[middle]);

        root.left = constructBST(nums, left, middle - 1);
        root.right = constructBST(nums, middle + 1, right);
        return root;
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length - 1);
    }

    
}