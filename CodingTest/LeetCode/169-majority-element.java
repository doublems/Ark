class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> maps = new HashMap<>();
        int[] maxNum = {0,0};
        for(int n : nums){
            if(maps.containsKey(n)){
                int count = maps.get(n)+1;
                if(count > maxNum[1]){
                    maxNum[0] = n;
                    maxNum[1] = count;
                }
                maps.put(n, count);
            }else{
                if(maxNum[1] == 0){
                    maxNum[0] = n;
                    maxNum[1] = 1;
                }
                maps.put(n, 1);
            }
        }

        return maxNum[0];

    }
}