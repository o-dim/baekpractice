class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int choibin[] = new int[1000];
        int max = 0;
        for(int i = 0 ; i < array.length; i++){
            choibin[array[i]]++;
            if(max < choibin[array[i]]){
                max = choibin[array[i]];
                answer = array[i];
            }
        }
        int temp = 0;
        for(int j = 0; j < 1000; j++){
            if(max == choibin[j]) temp ++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}