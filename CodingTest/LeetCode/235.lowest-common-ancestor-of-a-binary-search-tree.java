/**
 * 갈라치기 하는 순간을 찾으면 된다.
 * 굳이 끝까지 탐색하러 들어갈 필요는 없다.
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    private TreeNode lca;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root != null && lca == null) {
            int rv = root.val;
            int pv = p.val;
            int qv = q.val;
            if (rv > pv && rv > qv) {
                lowestCommonAncestor(root.left, p, q);
            } else if (rv < pv && rv < qv) {
                lowestCommonAncestor(root.right, p, q);
            } else {
                lca = root;
            }
        }
        return lca;
    }

}