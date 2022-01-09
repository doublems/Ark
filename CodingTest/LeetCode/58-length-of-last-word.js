/**
 * https://leetcode.com/submissions/detail/616219725/
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    return s.trim().split(' ').pop().length;
};