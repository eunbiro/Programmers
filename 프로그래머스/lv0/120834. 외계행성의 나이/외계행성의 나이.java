import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int age) {
        String answer = "";
        Map<String, String> agesNum = new HashMap<>();
        String ageStr = String.valueOf(age);

        for (int i = 0; i < 26; i++) {
            String aski = String.valueOf((char) (97 + i));
            String iKey = String.valueOf(i);
            agesNum.put(iKey, aski);
        }

        for (int i = 0; i < ageStr.length(); i++) {
            String addStr = String.valueOf(ageStr.charAt(i));
            answer += agesNum.get(addStr);
        }
        return answer;
    }
}