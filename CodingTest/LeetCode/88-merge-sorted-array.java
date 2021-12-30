/**
* 쉽게 푸는 방법. 성능은 고려안함
* https://leetcode.com/submissions/detail/609606932/
**/
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            for (int i = 0, mm = m; i < nums2.length; i++, mm++) {
                nums1[mm] = nums2[i];
            }
            Arrays.sort(nums1);
        }
    }
}