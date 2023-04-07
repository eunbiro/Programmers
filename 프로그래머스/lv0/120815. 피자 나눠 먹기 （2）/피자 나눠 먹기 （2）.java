class Solution {
    public int solution(int n) {
        int answer = 0;
        int check = 6;
        
        while (check % n != 0) {
            if (check % n != 0) {
                check += 6;
            }
        }
        answer = check / 6;
        return answer;
    }
}