class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= cipher.length()/code; i++) {
            sb.append(cipher.charAt(i * code - 1));
        }
        return sb.toString();
    }
}