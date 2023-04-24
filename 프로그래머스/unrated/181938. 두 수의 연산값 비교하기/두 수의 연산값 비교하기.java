class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        if (ab < 2 * a * b) {
            answer = 2 * a * b;
        } else {
            answer = ab;
        }
        
        return answer;
    }
}