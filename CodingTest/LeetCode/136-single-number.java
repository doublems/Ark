// 연산자 사용법
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int n : nums){
            result ^= n;
        }

        return result;
    }
}

// 자료구조
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
                set2.add(n);
            }else{
                set2.remove(n);
            }
        }

        Integer[] result = set2.toArray(new Integer[0]);

        return result[0];
    }
}