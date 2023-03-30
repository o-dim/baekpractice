class Solution {
    public int[] solution(int n) {
        n = (n % 2 == 0)? n-1 : n;
        int[] answer = new int[n / 2 + 1];
        int num = 1;
        for(int i = 0; i < (n/2)+1; i++){
            if(num <= n){
                answer[i] = num;
                num += 2; 
            } else {
                break;
            }
              
        }
        return answer;
    }
}