/**
 * https://leetcode.com/submissions/detail/624435857/
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const splited = s.split('');
    const stack = [];
    for(let i = 0; i < splited.length; i++) {
        if(splited[i] === ')'){
            if(stack.pop()!== '('){
                return false;
            }
        } else if(splited[i] === ']'){
            if(stack.pop()!== '['){
                return false;
            }
        } else if(splited[i] === '}'){
            if(stack.pop()!== '{'){
                return false;
            }
        }else {
            stack.push(splited[i]);
        }
    }
    return stack.length === 0;
};