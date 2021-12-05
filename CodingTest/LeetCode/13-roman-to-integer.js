const s1 = "III"; // 3
const s2 = "IV"; // 4
const s3 = "IX"; // 9
const s4 = "LVIII"; // 58 -> L = 50, V= 5, III = 3.
const s5 = "MCMXCIV"; // 1994 -> M = 1000, CM = 900, XC = 90 and IV = 4.
const s6 = "VI"; // 6
const s7 = "CMLII" //952

/**
 * https://leetcode.com/submissions/detail/597330526/
 * Runtime: 140 ms
 * Memory Usage: 45.4 MB
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const roman = new Map();
    roman.set('I', 1);
    roman.set('V', 5);
    roman.set('X', 10);
    roman.set('L', 50);
    roman.set('C', 100);
    roman.set('D', 500);
    roman.set('M', 1000);

    return s.split('')
        .map((v, i, array) => {
            if(roman.get(v) < roman.get(array[i+1])) {
                return -roman.get(v);
            } else {
                return roman.get(v);
            }
        })
        .reduce((p,c) => p + c);
};

console.log(romanToInt(s7))