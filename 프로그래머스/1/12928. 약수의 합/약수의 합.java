import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrayList.add(i);
            }
        }
        for (int num : arrayList) {
            answer += num;
        }
        return answer;
    }
}