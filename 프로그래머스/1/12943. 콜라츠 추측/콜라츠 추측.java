class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        while (true) {
            if (number == 1) {
                return answer;
            }
            if (answer == 500) {
                break;
            }
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            answer += 1;
        }
        return -1;
    }
}