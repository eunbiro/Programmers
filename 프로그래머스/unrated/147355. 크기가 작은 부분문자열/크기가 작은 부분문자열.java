import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlength = t.length();
        int plength = p.length();

        ArrayList<String> numChk = new ArrayList<>();
        
        for (int i = 0; i < tlength - plength + 1; i++) {
            String num;
            
            if ((tlength - plength) > i) {
            	
            	num = t.substring(i, plength + i);
            } else {
				
            	num = t.substring(i);
			}

            numChk.add(num);
        }
        
        for (String num : numChk) {
        	if (Long.parseLong(num) <= Long.parseLong(p)) {
        		answer++;
        	}
        }

        return answer;
    }
}