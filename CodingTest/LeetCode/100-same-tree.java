/**
 * DFS로 탐색하며 비교진행으로 해결하면 간단함
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
    private boolean result = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        run(p, q);
        return result;
    }

    private void run(TreeNode p, TreeNode q){
        if(p != null && q != null){
            if(p.val != q.val){
                result = false;
            }else{
                run(p.left, q.left);
                run(p.right, q.right);
            }
        }else{
            if(p == null && q != null || p != null && q == null){
                result = false;
            }
        }
    }
}