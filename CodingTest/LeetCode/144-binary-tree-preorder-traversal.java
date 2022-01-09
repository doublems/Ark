/**
 * https://leetcode.com/submissions/detail/616224720/
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
    private List<Integer> result= new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }
    public void preorder(TreeNode root) {
        if(root!=null){
            result.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
}