/**
 * Set이나 Map이나 큰 차이는 없음. 인상적인건 투포인터로 만든것이 더 느림
 * Set version : https://leetcode.com/submissions/detail/605766239/
 * Map version : https://leetcode.com/submissions/detail/605763498/
 * Two pointer : https://leetcode.com/submissions/detail/605762185/
 */
 class Solution {
     public boolean containsDuplicate(int[] nums) {
         Set<Integer> m = new HashSet<>();
         for(int n: nums){
             if(m.contains(n)){
                 return true;
             }
             m.add(n);
         }
         return false;
     }
 }