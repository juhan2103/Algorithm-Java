class Solution {
    public int solution(String t, String p) {
        int result = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String s = t.substring(i, i + p.length());
            if (s.compareTo(p) <= 0) {
                result += 1;
            }
        }
        return result;
    }
}