/**
 * https://leetcode.com/submissions/detail/617612800/
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
    private List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return result;
    }
    private void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            result.add(node.val);
        }
    }
}