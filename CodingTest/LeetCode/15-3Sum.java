/**
 * 투포인트 기법으로 풀어야함
 * 오름차순정렬을 해줘야함
 * 0 도달시 j 값은 맨 끝으로 설정, i는 계속 진행.
 * 현재값 고정, i와 j가 움직임.
**/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> sets = new HashSet<>();
        
        int i=0;
        int left=1;
        int right=nums.length-1;
        
        if(nums.length < 3){
            return result;
        }
        
        Arrays.sort(nums);
        
        while(i<nums.length && left < nums.length && i < left && left < right){
            int sum = nums[i]+nums[left]+nums[right];
            
            if(sum == 0){
                String key = nums[i]+""+nums[left]+""+nums[right];
                if(!sets.contains(key)){
                    sets.add(key);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp); 
                }
            }
            
            if(left<right && left + 1 < right && right - 1 > left){
                if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }else{
                i++;
                left = i+1;
                right = nums.length-1;
            }
        }
        
        return result;
    }
}