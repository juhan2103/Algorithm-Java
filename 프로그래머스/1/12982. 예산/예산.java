import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int result = 0;
        for (int i = 0; i < d.length; i++) {
            if (result + d[i] > budget) {
                continue;
            }
            result += d[i];
            answer += 1;
        }
        return answer;
    }
}