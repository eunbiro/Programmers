import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int num : numlist) {
        	
        	if (num%n == 0) {
        		arr.add(num);
        	}
        }
        
        answer = new int [arr.size()];
        for (int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}