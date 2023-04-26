class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String schar = "";
        
        for (int i = 0; i < s.length(); i++) {
            
            if (schar.indexOf(s.charAt(i)) > -1) {
                int num = 0;
                for (int k = 0; k < i; k++) {
                    if (s.charAt(i) == s.charAt(k)) {
                        num = k;
                    }
                }
                answer[i] = i - num;
                schar += s.charAt(i);
            } else {
                answer[i] = -1;
                schar += s.charAt(i);
            }
            
            
        }
        return answer;
    }
}