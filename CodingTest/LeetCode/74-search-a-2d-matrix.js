/**
 * 절반씩 분할, Pivot 기준으로 나눔, 결국 배열하나가 나옴. log2n
 * https://leetcode.com/submissions/detail/619026688/
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    if (matrix.length > 1) {
        let pivot = Math.round(matrix.length / 2), m;
        if (matrix[pivot][0] > target) {
            m = matrix.slice(0, pivot);
        } else if (pivot >= 1) {
            m = matrix.slice(pivot, matrix.length);
        }
        if (m.length > 0) {
            return searchMatrix(m, target);
        }
    }

    for (let i = 0; i < matrix[0].length; i++) {
        if (matrix[0][i] === target) {
            return true;
        }
    }
    return false;
};