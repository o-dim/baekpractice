class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String b : babbling) {
            b = b.replaceFirst("aya", "0");
            b = b.replaceFirst("woo", "0");
            b = b.replaceFirst("ye", "0");
            b = b.replaceFirst("ma", "0");
            b = b.replace("0", "");
            if(b.equals("")) answer++;
        }
        
        return answer;
    }
}