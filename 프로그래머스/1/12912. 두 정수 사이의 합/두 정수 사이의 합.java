class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int minNum = a > b ? b : a;
        int maxNum = a > b ? a : b;
        for (int i = minNum; i <= maxNum; i++) {
            answer += i;
        }
        return answer;
    }
}