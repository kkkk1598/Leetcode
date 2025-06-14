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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // base case
        if(root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        q.add(root);
        int currLevel = 0;

        while(!q.isEmpty()){
            int qLength = q.size();
            res.add(new ArrayList<Integer>());

            for(int i = 0; i<qLength; i++){
                TreeNode node = q.poll();
                res.get(currLevel).add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }
            }
            currLevel++;
        }

        
        return res;
    }
}