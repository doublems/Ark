/**
 * @param {number[]} nums
 * @return {number}
 * @see https://leetcode.com/submissions/detail/591956075/
 * Runtime: 145 ms
 * Memory Usage: 44.3 MB
 * Date: 2021-11-24
 */
var arrayPairSum = function(nums) {
    const sorted = nums.sort((a, b) => b - a);
    let result = 0;
    for(let i = 1; i<sorted.length; i+=2){
        result+=sorted[i];
    }
    return result;
};