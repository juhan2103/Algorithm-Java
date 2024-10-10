import java.util.*;
class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String s1 = new String(charArr);
        String answer = new StringBuilder(s1).reverse().toString();
        return answer;
    }
}