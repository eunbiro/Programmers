import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] average = new float[score.length];

        for (int i = 0; i < score.length; i++){
            average[i] = (score[i][0] + score[i][1]) / 2f;
        }

        List<Float> chkAvg = new ArrayList<>();

        for (int i = 0; i < average.length; i++) {
            chkAvg.add(average[i]);
        }

        for (int i = 0; i < chkAvg.size() - 1; i++) {
            for (int j = 0; j < chkAvg.size() - 1; j++) {
                if (chkAvg.get(j) < chkAvg.get(j + 1)) {
                    float temp = chkAvg.get(j);
                    chkAvg.set(j, chkAvg.get(j + 1));
                    chkAvg.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] == chkAvg.get(j)) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}