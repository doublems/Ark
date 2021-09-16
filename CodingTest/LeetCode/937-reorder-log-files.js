/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/554504413/
 * Runtime: 108 ms
 * Memory Usage: 45.7 MB
 * Date: 2021-09-15
 */
var reverseString = function(s) {
    return s.reverse();
};


/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/555378717/
 * Runtime: 100 ms
 * Memory Usage: 45.8 MB
 * Date: 2021-09-15
 * This code is little bit faster then upper code. but upper codes readability is better.
 */
var reverseString2 = function(s) {
    const lt = s.length;
    for(let i = 0; i<(lt/2) ; i++ ) {
        let rr = s[i];
        let tt = s[lt-i-1];
        s[i] = tt;
        s[lt-i-1] = rr;
    }
};