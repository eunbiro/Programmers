class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
        	
        	char chkS = s.charAt(i);
        	int iptloop = index;
        	
    		for (int j = 1; j < iptloop + 1; j++) {
    			
    			char chkSkip = (char)(chkS + j);
    			
    			while (chkSkip > 'z') {
    				chkSkip = (char) ((chkSkip - 122) + 96);
    			}	
    			
    			if (skip.indexOf(chkSkip) > -1) {
    				iptloop++;
    			}
    		}
    		
    		int ipt = s.charAt(i) + iptloop;
    		while (ipt > 'z') {
    			ipt = ((ipt - 122) + 96);
    		}
        	answer += (char)ipt;
        }
        return answer;
    }
}