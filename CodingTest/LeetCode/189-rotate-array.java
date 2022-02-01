// 반복하려는 리스트의 개수가 3개라면 3회 반복시에는 제자리 임
class Solution {
    public static void rotate(int[] nums, int k) {

        int circle = k;

        if (nums.length <= k) {
            circle = k % nums.length;
        }

        if (circle >= 1) {
            int[] temps = new int[circle];
            int curr = temps.length - 1;
            for (int i = nums.length - 1, j = circle; i >= 0; i--, j--) {
                if (j > 0) {
                    temps[j - 1] = nums[i];
                }
                if (i < circle) {
                    nums[i] = temps[curr--];
                } else {
                    nums[i] = nums[i - circle];
                }
            }
        }
    }
}

// 반복하려는 리스트의 개수가 3개라면 3회 반복시에는 제자리 임
// 3개가 7번 반복인 경우에는 나머지 값을 찾을 때까지 재귀로 돌리는 방법을 사용
import java.util.Arrays;

class Scratch {

    public static void main(String[] args) {

        rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        rotate(new int[] { 1, 2 }, 3);
        rotate(new int[] { 1, 2 }, 5);
    }

    public static void rotate(int[] nums, int k) {

        int circle = k;

        if (nums.length <= k) {
            // 반복하려는 리스트의 개수가 3개라면 3회 반복시에는 제자리 임
            // 3개가 7번 반복인 경우에는 나머지 값을 찾을 때까지 재귀로 돌리는 방법을 사용
            rotate(nums, Math.abs(nums.length - k));
        } else {
            if (circle >= 1) {
                int[] temps = new int[circle];
                int curr = temps.length - 1;
                for (int i = nums.length - 1, j = circle; i >= 0; i--, j--) {
                    if (j > 0) {
                        temps[j - 1] = nums[i];
                    }
                    if (i < circle) {
                        nums[i] = temps[curr--];
                    } else {
                        nums[i] = nums[i - circle];
                    }
                }
            }

            System.out.println(circle);
            System.out.println(Arrays.toString(nums));
        }
    }
}

