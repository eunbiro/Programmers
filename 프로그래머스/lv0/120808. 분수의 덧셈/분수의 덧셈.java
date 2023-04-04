class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int maxdenom = numer == denom ? numer : numer > denom ? numer : denom;
        int mindenom = numer == denom ? numer : numer < denom ? numer : denom;
        
        while (mindenom != 0) {
        	int temp = maxdenom % mindenom;
        	maxdenom = mindenom;
        	mindenom = temp;
        }
        
    	answer[0] = numer / maxdenom;
    	answer[1] = denom / maxdenom;
        
        return answer;
    }
}