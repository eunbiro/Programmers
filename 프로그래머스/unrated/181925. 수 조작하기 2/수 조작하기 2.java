import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "w");
        map.put(-1, "s");
        map.put(10, "d");
        map.put(-10, "a");
        
        for (int i = 0; i < numLog.length - 1; i++) {
            answer += map.get(numLog[i + 1] - numLog[i]);
        }
        return answer;
    }
}