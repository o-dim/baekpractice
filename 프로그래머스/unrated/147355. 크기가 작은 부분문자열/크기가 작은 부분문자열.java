class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long target = Long.parseLong(p);
        int len = p.length();
        // t를 p개씩 뽑아내기
        for(int i = 0; i < t.length() - len + 1; i++) {
            String tStr = t.substring(i, i + len);
            Long threeDegits = Long.parseLong(tStr);
            if (threeDegits.compareTo(target) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}