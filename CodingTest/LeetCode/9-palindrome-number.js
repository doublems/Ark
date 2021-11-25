/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return false;
    return x.toString() === x.toString().split('').reverse().join('');
};

/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome2 = function(x) {
    if(x < 0) {
        return false;
    }
    const a = x.toString();
    for (let i =0, j = a.length - 1; i < j; i++, j--) {
        if(a.charAt(i) !== a.charAt(j)){
            return false;
        }
    }
    return true
};