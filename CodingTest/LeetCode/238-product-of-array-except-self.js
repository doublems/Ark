/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/592367745/
 * Runtime: 7004 ms
 * Memory Usage: 48.7 MB
 * Date: 2021-11-25
 * Tip: 왼쪽 곱셈의 결과에 오른쪽의 값을 차례대로 곱셈한다. result[0]의 초기값은 1로 두어 오른편의 모든 값이 곱해질 수 있도록 한다.
 * 오른쪽을 구하는 중 0있다면 더 이상 진행 할 필요가 없다. (왼편의 경우에는 반드시 1회는 순회해야 하기에 pv*cv로 둔다)
 */
var productExceptSelf = function(nums) {

    const result = [1];

    nums.reduce((pv, cv, index, array) => {
        let right = 1;
        for(let i = index; i < array.length; i++){
            right *= array[i];
            if(right === 0){
                break;
            }
        }
        result[index-1] *= right;
        result[index] = pv;
        return pv * cv;
    })

    return result;
};