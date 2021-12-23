/**
 * https://leetcode.com/submissions/detail/605821822/
 * 계속 직진하며 순차적으로 더 한 값 중 최대 값을 넣으면 됨
 * @param {number[]} nums
 * @return {number}
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pv = nums[0];
        for(int i = 1 ;i < nums.length; i++){
            pv = Math.max(pv+nums[i], nums[i]);
            max = Math.max(pv, max);
        }
        return max;
    }
}