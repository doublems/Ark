/*
 * Binary Search 를 이용한 해결 방법으로 구현
 * 이전 js 버전보다 100배 빨라졌다. (이전 100 ms -> 이후 1m)
  */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        if(nums[left] >= target){
            return 0;
        }

        if(nums[right] < target){
            return right+1;
        }

        while(left<=right){
            mid = left + (right - left) / 2;
            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        return left;
    }
}