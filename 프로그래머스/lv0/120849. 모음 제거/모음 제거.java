class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        if (answer.indexOf('a') > -1) {
            answer = answer.replaceAll("a", "");
        }
        if (answer.indexOf('e') > -1) {
            answer = answer.replaceAll("e", "");
        }
        if (answer.indexOf('i') > -1) {
            answer = answer.replaceAll("i", "");
        }
        if (answer.indexOf('o') > -1) {
            answer = answer.replaceAll("o", "");
        }
        if (answer.indexOf('u') > -1) {
            answer = answer.replaceAll("u", "");
        }
        
        return answer;
    }
}