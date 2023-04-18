class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = my_string;
        char num1Str = my_string.charAt(num1);
        char num2Str = my_string.charAt(num2);
        
        answer = answer.substring(0, num1) + num2Str + answer.substring(num1 + 1);
        answer = answer.substring(0, num2) + num1Str + answer.substring(num2 + 1);
        
        return answer;
    }
}