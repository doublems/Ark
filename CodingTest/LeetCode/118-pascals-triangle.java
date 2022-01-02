// O(n^2) Time complexity 로 구현
// DP로 해결 필요함
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 1;i<=numRows;i++){
            if(i == 1) {
                result.add(new ArrayList<>(Arrays.asList(1)));
            }else if(i == 2) {
                result.add(new ArrayList<>(Arrays.asList(1,1)));
            }else{
                List<Integer> temps = new ArrayList<>(Arrays.asList(1));
                for(int j = 1;j<i-1;j++){
                    temps.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
                }
                temps.add(1);
                result.add(temps);
            }
        }

        return result;
    }
}