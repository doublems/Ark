/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private TreeNode result = null;
    public TreeNode searchBST(TreeNode tn, int val) {

        if (tn != null) {
            if (tn.val == val) {
                result = tn;
            } else if (val > tn.val) {
                searchBST(tn.right, val);
            } else {
                searchBST(tn.left, val);
            }
        }

        return result;

    }
}