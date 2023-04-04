class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float ans = (float)num1 / num2;
        answer = (int)(ans * 1000);
        return answer;
    }
}