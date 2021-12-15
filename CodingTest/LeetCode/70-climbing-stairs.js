/**
 * https://leetcode.com/submissions/detail/601768096/
 * 각 숫자의 증가에 따라서 두계단전 한계단전의 갯수를 더한 값이 현재 값이 됨
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n === 1){ return 1; }
    if(n === 2){ return 2; }
    let [a, b, c] = [1, 2, 0];
    for(let i=3;i<=n;i++){
        c = a + b;
        a = b;
        b = c;
    }
    return c;
};
