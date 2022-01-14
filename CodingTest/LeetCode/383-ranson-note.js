/**
 * https://leetcode.com/submissions/detail/619667317/
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function (ransomNote, magazine) {
    const map = {};
    const s = ransomNote.split('');
    for (let i = 0; i < s.length; i++) {
        const index = magazine.indexOf(s[i], map[s[i]] ?? 0);
        if (index === -1) {
            return false;
        }
        map[s[i]] = index + 1;
    }
    return true
};