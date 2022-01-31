/*
val에 해당하지 않는 데이터만 진행하며 삽입
https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}