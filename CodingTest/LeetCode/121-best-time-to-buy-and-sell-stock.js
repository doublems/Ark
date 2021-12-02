/**
 * @param {number[]} nums
 * @return {number}
 * @see https://leetcode.com/submissions/detail/595922344/
 * Runtime: 100 ms
 * Memory Usage: 49.1 MB
 * Date: 2021-12-02
 */
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let low, high, max = 0;
    prices.forEach((current, i, arr) => {
        if(low === undefined || low > current && arr[i+1] !== undefined){
            low = current;
            high = 0;
        } else if(high < current){
            high = current;
        }
        if(max < high - low) {
            max = high - low;
        }
    })
    return max;
};