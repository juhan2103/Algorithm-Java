class Solution {
    public boolean solution(String str) {
        if (str.length() == 4 || str.length() == 6) {
            for (char s : str.toCharArray()) {
                if (!Character.isDigit(s)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}