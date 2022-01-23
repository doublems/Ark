/**
 * 큐를 두개 사용하는 방법, 무겁고 느리다.
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        List<Integer> levelsVals = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode tn = queue.poll();

            if (tn != null) {
                System.out.println(tn.val);
                levelsVals.add(tn.val);
                queue2.offer(tn.left);
                queue2.offer(tn.right);
            }
            if (queue.isEmpty()) {
                if(!levelsVals.isEmpty()){
                    result.add(levelsVals);
                }
                levelsVals = new ArrayList<>();
                queue = queue2;
                queue2 = new LinkedList<>();
            }

        }

        return result;
    }
}