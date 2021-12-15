/**
 * https://leetcode.com/submissions/detail/602205001/
 * 계속 직진하며 순차적으로 더 한 값 중 최대 값을 넣으면 됨
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let max = nums[0];
    const curr = nums.reduce((pv, cv) => {
        if(pv >= max) max = pv;
        return Math.max(pv+cv, cv);
    })
    return Math.max(curr, max);
};