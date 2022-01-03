/**
 * https://leetcode.com/submissions/detail/612126732/
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
    if (s.length !== t.length) {
        return false;
    }
    const map = {};
    s.split('').forEach(c => map[c] = map[c] ? map[c] + 1 : 1);
    t.split('').forEach(c => map[c] = map[c] ? map[c] - 1 : -1);
    return Object.keys(map).every(k => map[k] === 0);
};