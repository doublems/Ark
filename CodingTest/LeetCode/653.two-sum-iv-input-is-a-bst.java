/**
 * BFS로 진행하여 k를 뺀 나머지 수를 set에서 찾는다.
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

    public boolean findTarget(TreeNode root, int k) {

        boolean result = false;
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode r = queue.poll();
            if (r != null) {
                int need = k - r.val;

                if (set.contains(need)) {
                    result = true;
                    break;
                }

                set.add(r.val);
                queue.offer(r.left);
                queue.offer(r.right);
            }
        }

        return result;
    }
}