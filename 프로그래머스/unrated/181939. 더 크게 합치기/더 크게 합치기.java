class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        if((bStr + aStr).compareTo(aStr + bStr) > 0) {
            answer = Integer.parseInt(bStr + aStr);
        } else {
            answer = Integer.parseInt(aStr + bStr);
        }
        return answer;
    }
}
