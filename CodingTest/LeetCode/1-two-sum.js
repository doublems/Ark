/**
 * @param {number[]} nums
 * @param {number} target
 * @see https://leetcode.com/submissions/detail/568758170/
 * Runtime: 80 ms
 * Memory Usage: 41 MB
 * Date: 2021-10-10
 */
var twoSum = function(nums, target) {
    // init
    const map = {};
    for(let i = 0; i < nums.length; i++){
        const n = nums[i];

        //get
        const needed = target - n;
        console.log(n)
        console.log(needed)

        if(map[needed]){
            console.log([map[needed][0], i])
            return [map[needed][0], i]
        }

        if(!map[n]){
            map[n] = [];
        }
        map[n].push(i);
    }
    return [];
};

const result = twoSum(nums2, target2);