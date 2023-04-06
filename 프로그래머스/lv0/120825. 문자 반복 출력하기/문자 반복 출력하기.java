import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] cut = my_string.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < cut.length; i++){
            for(int j = 0; j < n; j++){
                sb.append(cut[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}