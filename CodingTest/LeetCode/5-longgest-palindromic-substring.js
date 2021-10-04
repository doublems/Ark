/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/565647918/
 * Runtime: 1032 ms
 * Memory Usage: 45.6 MB
 * Date: 2021-10-04
 * Tip: This coded has concept about window slicing..
 */
var longestPalindrome = function(s) {
    const splited = s.split('');
    let result = [];
    let result2 = [];
    let finalResult = [];

    if(splited.length === 1){
        return s;
    }

    for(let i = 0; i < splited.length; i++) {
        if(splited[i] === splited[i+1]) {
            result = [];
            result.push(splited[i]);
            result.push(splited[i+1]);
            for(let j = i-1, k = i+2; j >= 0 || k<=splited.length; j--, k++){
                if(splited[j] && splited[k] && splited[j] === splited[k]) {
                    result.push(splited[k]);
                    result.unshift(splited[j]);
                } else {
                    break;
                }
            }
        }

        if(splited[i] === splited[i+2]) {
            result2 = [];
            result2.push(splited[i]);
            result2.push(splited[i+1]);
            result2.push(splited[i+2]);

            for(let j = i-1, k = i+3; j >= 0 || k<=splited.length; j--, k++){
                if((splited[j] && splited[k]) && (splited[j] === splited[k])) {
                    result2.push(splited[k]);
                    result2.unshift(splited[j]);
                } else {
                    break;
                }
            }
            console.log(result2.join(''));
        }
        let temp;
        if(result.length > result2.length) {
            temp = result;
        } else {
            temp = result2;
        }

        if(temp.length > finalResult.length) {
            finalResult = temp;
        }
    }

    if(finalResult.length === 0){
        return splited[0];
    }

    return finalResult.join('');
};