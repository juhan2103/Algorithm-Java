class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            int num1 = s.length() / 2 - 1;
            int num2 = s.length() / 2;
            answer += s.charAt(num1);
            answer += s.charAt(num2);
        } else {
            answer += s.charAt(s.length() / 2);
        }
        return answer;
    }
}