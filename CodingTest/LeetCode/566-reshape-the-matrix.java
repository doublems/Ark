// 쉽게 작성
// stream을 안쓰면 성능이 더 좋음
// https://leetcode.com/submissions/detail/610233791/
class Solution {

    private int rr = 0;
    private int cc = 0;

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] results = new int[r][c];
        int[] result = Arrays.stream(mat).flatMapToInt(IntStream::of).toArray();

        if (result.length != r * c) {
            return mat;
        }

        Arrays.stream(result)
                .forEach(v -> {
                    if (rr < r) {
                        if (cc < c) {
                            results[rr][cc] = v;
                            cc++;
                        } else {
                            rr++;
                            cc = 0;
                            results[rr][cc] = v;
                            cc++;
                        }
                    }
                });

        return results;

    }
}