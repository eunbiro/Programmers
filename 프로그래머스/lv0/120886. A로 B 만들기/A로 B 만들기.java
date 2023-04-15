class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String cutStr = before;
        for (int i = 0; i < after.length(); i++) {
            if (before.indexOf(String.valueOf(after.charAt(i))) > -1) {
                cutStr = cutStr.replaceFirst(String.valueOf(after.charAt(i)), "");
            }
        }
        
        if (cutStr.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}