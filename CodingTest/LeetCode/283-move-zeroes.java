//빠른방법
// 0이 아닌 경우를 순서대로 삽입 후, 나머지 칸을 0으로 채운다.
class Solution {

    public void moveZeroes(int[] nums) {

        int currIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currIndex++] = nums[i];
            }
        }

        for (int j = currIndex; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}



// 느린방법
// 0을 발견하면 뒤로 이동시킨다.
class Solution {

    public void moveZeroes(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }
    }
}