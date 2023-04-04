class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
        	int n = price * i;
        	
        	if (n <= money) {
        		money -= n;
        		answer = 0;
        	} else if (n > money) {
        		answer += n - money;
        		money = 0;
        	}
        }
                        
        return answer;
    }
}