// left, right 포인트를 지정해서 max 값의 윈도우를 만든다.
// 순회하며 윈도우 크기를 확인 후 저장한다.
class Solution {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;
        char[] cs = s.toCharArray();
        Map<Character, Integer> maps = new HashMap<>();

        for (int right = 0; right < cs.length; right++) {
            // 같은 값이 발견되었을 경우, 그 다음칸이 left로 지정된다.
            // 다만, left의 값은 현재보다 더 작아 질 수는 없다.
            if (maps.containsKey(cs[right])) {
                left = Math.max(left, maps.get(cs[right]) + 1);
            }

            // 각 순회시마다 윈도우 크기를 확인해서 추가한다.
            max = Math.max(max, right - left + 1);

            // 현재의 인덱스 값 right를 각 요소와 함께 저장한다.
            maps.put(cs[right], right);
        }

        return max;
    }
}