import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        Map<String, String> moving = new HashMap<>();
        moving.put("left", "-1,0");
        moving.put("right", "1,0");
        moving.put("up", "0,1");
        moving.put("down", "0,-1");

        for (int i = 0; i < keyinput.length; i++) {
            String[] cutStr = moving.get(keyinput[i]).split(",");

            answer[0] += Integer.parseInt(cutStr[0]);
            if ((board[0] - 1) / 2 < answer[0]) {
                answer[0] = (board[0] - 1) / 2;
            } else if (-(board[0] - 1) / 2 > answer[0]) {
                answer[0] = -(board[0] - 1) / 2;
            }

            answer[1] += Integer.parseInt(cutStr[1]);
            if ((board[1] - 1) / 2 < answer[1]) {
                answer[1] = (board[1] - 1) / 2;
            } else if (-(board[1] - 1) / 2 > answer[1]) {
                answer[1] = -(board[1] - 1) / 2;
            }
        }
        return answer;
    }
}