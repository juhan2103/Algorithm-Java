class Solution {
    public double solution(int[] arr) {
        int sumResult = 0;
        for (int i = 0; i < arr.length; i++) {
            sumResult += arr[i];
        }
        return (double) sumResult / arr.length;
    }
}