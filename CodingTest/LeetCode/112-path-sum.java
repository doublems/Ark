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
    private boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(isLeaf(root) && root.val == targetSum) result = true;

        run(root.left, targetSum - root.val);
        run(root.right, targetSum - root.val);

        return result;
    }

    private void run(TreeNode n, int targetSum){
        if(n != null && result == false){
            run(n.left, targetSum - n.val);
            run(n.right, targetSum - n.val);
            if(isLeaf(n) && targetSum - n.val == 0) result = true;
        }
    }

    private boolean isLeaf(TreeNode n){
        return n.left == null && n.right == null;
    }
}

// 더 짧게
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(isLeaf(root) && root.val == targetSum) return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    private boolean isLeaf(TreeNode n){
        return n.left == null && n.right == null;
    }
}

