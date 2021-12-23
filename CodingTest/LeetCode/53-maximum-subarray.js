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

/**
 * https://leetcode.com/submissions/detail/605825129/
 *  * 계속 직진하며 순차적으로 더 한 값 중 최대 값을 넣으면 됨
 *  * 새로 시작한 값이 더 큰 경우 curr 새로 시작
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let [max, curr] = [nums[0], nums[0]];
    for(let i=1;i<nums.length;i++){
        curr = Math.max(curr+nums[i], nums[i]);
        max = Math.max(curr, max);
    }

    return max;
};