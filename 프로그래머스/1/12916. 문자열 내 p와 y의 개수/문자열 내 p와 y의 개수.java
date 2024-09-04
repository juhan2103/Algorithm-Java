class Solution {
    boolean solution(String str) {
        int pSum = 0;
        int ySum = 0;
        str = str.toLowerCase();
        for (String s : str.split("")) {
            if (s.equals("p")) {
                pSum += 1;
            }
            if (s.equals("y")) {
                ySum += 1;
            }
        }
        return pSum == ySum;
    }
}