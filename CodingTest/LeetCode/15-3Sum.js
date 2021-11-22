/**
 * @param {number[]} nums
 * @return {number[][]}
 * @see https://leetcode.com/submissions/detail/591009798/
 * Runtime: 1712 ms
 * Memory Usage: 69.6 MB
 * Date: 2021-11-22
 * 투포인트 기법으로 풀어야함
 * JS Sort 주의. 오름차순정렬을 해줘야함
 * 0 도달시 j 값은 맨 끝으로 설정, i는 계속 진행.
 * 현재값 고정, i와 j가 움직임.
 */
var threeSum = function(nums) {
    if(nums.length < 3){
        return [];
    }
    const sorted = nums.sort((a,b) => a-b);
    const resultMap = new Map();
    const result = [];
    sorted.forEach((value, index) => {
        let i = index+1;
        let j = sorted.length-1;

        while (i<j){
            const r = value + sorted[i] + sorted[j];
            const kr = `${value}${sorted[i]}${sorted[j]}`;
            const ar = [value, sorted[i], sorted[j]];
            if(r === 0 && !resultMap.get(kr)){
                resultMap.set(kr, ar);
                result.push(ar);
                i++;
                j = sorted.length-1;
            } else if(r <= 0){
                i++;
            } else if(r > 0){
                j--;
            }
        }
    });

    return result;
};