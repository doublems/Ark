/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end){
        //  start + end 로 할 경우에는 int가 담을 수 있는 수의 최대 크기를 벗어날 수 있다. 때문에 다음과 같이 작성하여 회피한다.
        //   y + (x-y) / 2 == (x + 2) / 2 .. 하... 기초산수인데... 후..
            int missed =  start + (end - start) / 2 ;
            System.out.println(missed);

            if(isBadVersion(missed)){
                end = missed;
            } else {
                start = missed + 1;
            }
        }

        return start;
    }
}