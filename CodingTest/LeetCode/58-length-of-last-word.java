// https://leetcode.com/submissions/detail/616221580/
class Solution {
    public int lengthOfLastWord(String s) {
        String[] temp = s.trim().split(" ");
        return temp[temp.length-1].length();
    }
}