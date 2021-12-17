/**
 * https://leetcode.com/submissions/detail/603045481/
 * 절반씩 짤라가며 나아간다. 인덱스는 계속해서 진행 될 때 추가한다.
 * (오른쪽으로 갈 때 추가)
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
    if (nums[0] >= target) {
        return 0;
    }
    if (nums[nums.length - 1] < target) {
        return nums.length;
    }
    if (nums[nums.length - 1] === target) {
        return nums.length - 1;
    }
    let result = 1;
    while (nums.length > 1) {
        const pivot = Math.round(nums.length / 2);
        if (nums[pivot] < target) {
            nums = nums.slice(pivot, nums.length);
            result += pivot;
        } else {
            nums = nums.slice(0, pivot)
        }
    }
    return result
};