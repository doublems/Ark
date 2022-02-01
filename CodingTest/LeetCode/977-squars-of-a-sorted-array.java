import java.sql.Array;
import java.util.Arrays;

class Scratch {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
        System.out.println(Arrays.toString(sortedSquares2(new int[] { -4, -1, 0, 3, 10 })));

    }

// 투포인터 사용
// 1. 절대값 기준으로 큰수 작은수를 비교
// 2. 비교후 i의 수가 커서 사용되면 i를 증가
// 3. j가 기존과 동일하면 j를 감소
// 4. 모든 비교후에는 curr 포인터를 감소시킴
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int curr = nums.length-1;

        for(int i = 0, j = nums.length - 1; i<= j;){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                result[curr] = nums[i] * nums[i];
                i++;
            }else {
                result[curr] = nums[j] * nums[j];
                j--;
            }
            curr--;
        }
        return result;
    }

// 쉬운방법
    public static int[] sortedSquares2(int[] nums) {
        return Arrays.stream(nums).parallel().map((n) -> n * n).sorted().toArray();
    }
}