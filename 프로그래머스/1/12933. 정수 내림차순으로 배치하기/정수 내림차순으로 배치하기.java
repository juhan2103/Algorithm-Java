import java.util.*;
class Solution {
    public long solution(long n) {
        String[] strList = Long.toString(n).split("");
        Arrays.sort(strList, Collections.reverseOrder());
        String str = "";
        for (String s: strList) {
            str += s;
        }
        return Long.parseLong(str);
    }
}