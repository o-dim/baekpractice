import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();
        for(int i = 1; i < food.length; i++) {
            for(int j = 1; j <= food[i] / 2; j++) {
                answer.append(String.valueOf(i));
            }
        }
        String str = answer.toString() + "0" + answer.reverse().toString();

        return str;

    }
}