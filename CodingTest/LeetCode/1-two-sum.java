// https://leetcode.com/submissions/detail/608523181/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(maps.containsKey(target-nums[i])){
                int[] result = {i, maps.get(target-nums[i])};
                return result;
            }
            maps.put(nums[i], i);
        }
        return null;
    }
}