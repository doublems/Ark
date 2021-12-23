/**
* [1,0,2,3] -> [1,0,0,2] 로 이동시키며 배열 변화하기
* https://leetcode.com/submissions/detail/606219789/?from=explore&item_id=3245
*/
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] results = new int[arr.length];
        for(int i = 0,j=0; i<arr.length && j<results.length; i++,j++) {
            results[j] = arr[i];
            if(arr[i] == 0 && (results.length > j+1)){
                j++;
                results[j] = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = results[i];
        }
    }
}