//https://leetcode.com/submissions/detail/610143585/
// 읽고 쓰기 쉽게 작성한 버전
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>=nums2.length){
            return getIntersection(nums2, nums1);
        }
        return getIntersection(nums1, nums2);
    }

    private int[] getIntersection(int[] target, int[] campare){
        Map<Integer, Integer> maps = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i : target){
            Integer num = maps.getOrDefault(i,0);
            maps.put(i, num+1);
        }

        for(int i : campare){
            if(maps.containsKey(i)){
                Integer num = maps.get(i);
                if(num > 0) {
                    result.add(i);
                    maps.put(i, num-1);
                }else{
                    maps.remove(i);
                }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}