import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Map<String, String> strMap = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            String strKey = String.valueOf((char) (97 + i));
            String strUpKey = String.valueOf((char) (65 + i));
            strMap.put(strKey, strUpKey);
            strMap.put(strUpKey, strKey);
        }

        for (int i = 0; i < my_string.length(); i++) {
            answer += strMap.get(String.valueOf(my_string.charAt(i)));
        }
        return answer;
    }
}