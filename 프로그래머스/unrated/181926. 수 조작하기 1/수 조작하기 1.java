import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        Map<String, Integer> con = new HashMap<>();
        
        con.put("w", 1);
        con.put("s", -1);
        con.put("d", 10);
        con.put("a", -10);
        
        for (int i = 0; i < control.length(); i++) {
            n += con.get(String.valueOf(control.charAt(i)));
        }
        
        return answer = n;
    }
}