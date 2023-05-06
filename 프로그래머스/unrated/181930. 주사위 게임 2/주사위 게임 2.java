class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        
        int[] abc = new int[3];
        abc[0] = a;
        abc[1] = b;
        abc[2] = c;
        
        int count = 0;
        
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (abc[i] == abc[j]) {
                    count++;
                }
            }
        }
        
        if (count == 1) {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c));
        } else if (count >= 2) {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        }
        return answer;
    }
}