/**
 * O(2N) 느린 풀이
 * https://leetcode.com/submissions/detail/612138514/
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
    const map = {};
    const ss = s.split('');
    ss.forEach((v) => map[v] = map[v] ? map[v] + 1 : 1);
    for (let i = 0; i < ss.length; i++) {
        if (map[ss[i]] === 1) {
            return i;
        }
    }

    return -1;
};