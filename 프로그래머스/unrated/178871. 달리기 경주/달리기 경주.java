import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> answer = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            answer.put(players[i], i);
        }
        for(String c : callings){
            int now = answer.get(c);
            String pre = players[now - 1];
            players[now - 1] = c;
            players[now] = pre;
            answer.put(c, now - 1);
            answer.put(pre, now);
        }
        
        return players;
    }
}