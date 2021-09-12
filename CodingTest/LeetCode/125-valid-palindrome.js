/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/553683389/
 * Runtime: 147 ms
 * Memory Usage: 42.7 MB
 * Date: 2021-09-13
 */
var isPalindrome = function(s) {
    const regex = /[^A-Za-z0-9]/gi;
    const after = s.replace(regex, '').toUpperCase().trim().split('');

    for(let c of after) {
        let last = after.pop();

        if(!last && after.length === 0) {
            return true;
        }

        if(last !== c) {
            return false;
        }
    }

    return true;
};