/**
 * @param {string} s
 * @return {boolean}
 * https://leetcode.com/submissions/detail/559039854/
 * Runtime: 128 ms
 * Memory Usage: 49.5 MB
 * Date: 2021-09-16
 */
var groupAnagrams = function(strs) {
    const result = {};
    strs.forEach((s) => {
        const key = s.split('').sort().join('');
        const kv = result[key];
        if(!kv) {
            result[key] = [s];
        } else {
            kv.push(s);
        }
    })
    return Object.values(result);
};

/**
 * @param {string} s
 * @return {boolean}
 * https://leetcode.com/submissions/detail/559028401/
 * Runtime: 116 ms
 * Memory Usage: 48.4 MB
 * Date: 2021-09-16
 */
var groupAnagrams = function(strs) {
    const resultMap = new Map();
    strs.forEach((s) => {
        const key = s.split('').sort().join('');
        const kv = resultMap.get(key)
        if(!kv) {
            resultMap.set(key, [s]);
        } else {
            kv.push(s);
        }
    })

    const resultArray = [];
    resultMap.forEach((value) => resultArray.push(value));

    return  resultArray.sort((a, b) => {
        if(a.length < b.length) {
            return -1;
        }
        if(a.length > b.length) {
            return 1;
        }
        return 0;
    });
};