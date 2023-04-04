class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        answer = String.valueOf(num).indexOf(String.valueOf(k));
        if (answer != -1) {
        	answer += 1;
        }
        return answer;
    }
}