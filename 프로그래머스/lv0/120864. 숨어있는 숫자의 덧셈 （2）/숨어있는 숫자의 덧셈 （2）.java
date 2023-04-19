class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strNum = my_string.split("[a-zA-Z]");
        
        for (String num : strNum) {
            if (!num.isEmpty()) {   
            answer += Integer.parseInt(num);
            }
        }
        
        return answer;
    }
}