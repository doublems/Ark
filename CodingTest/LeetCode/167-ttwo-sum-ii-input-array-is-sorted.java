// 정렬이 되어있는 상황에서 사용가능
// two pointer 사용
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;

        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right + 1};
            }

            if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}