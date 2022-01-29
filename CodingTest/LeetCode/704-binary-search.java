class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1; // 값이 없을 경우를 위해서 범위를 증가시켜서 해결
            } else{
                right = mid - 1; // 값이 없을 경우를 위해서 범위를 줄여서 해결
            }
        }
        
        return -1;
    }
}