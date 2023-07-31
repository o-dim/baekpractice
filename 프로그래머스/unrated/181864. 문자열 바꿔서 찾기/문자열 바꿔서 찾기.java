class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for(char str : myString.toCharArray()) {
            if(str == 'A') {
                sb.append('B');
            } else if(str == 'B') {
                sb.append('A');
            }
        }
        return sb.toString().contains(pat) == true? 1 : 0;
    }
}