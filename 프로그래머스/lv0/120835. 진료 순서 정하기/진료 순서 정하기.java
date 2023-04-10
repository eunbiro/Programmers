import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> seq = new ArrayList<>();

        for (int i = 0; i < emergency.length; i++) {
            seq.add(emergency[i]);
        }

        seq.sort(Comparator.reverseOrder());

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == seq.get(j)) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}