class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGDC(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
    static int getGDC(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        } else {
            return getGDC(num2, num1 % num2);
        }
    }
}