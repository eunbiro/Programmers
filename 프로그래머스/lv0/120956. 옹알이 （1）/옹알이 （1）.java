class Solution {
    public int solution(String[] babbling) {
String babeTalk[] = { "aya", "ye", "woo", "ma" };
        int count = 0;
        
        for (int i = 0; i < babbling.length; i++) {
        	String check = babbling[i];

        	for (int j = 0; j < babeTalk.length; j++) {
        		
        		int index = check.indexOf(babeTalk[j]);

        		if (index != -1) {
        			check = check.replaceAll(babeTalk[j], "1");

        		}
        		
        	}

        	String match = "[0-9]+";
        	if (check.matches(match)) {
        		count++;
        	}
	
        }
        return count;
    }
}