class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (dots[i][0] == dots[j][0]) {
                    width = dots[i][1] - dots[j][1];
                } else if (dots[i][1] == dots[j][1]) {
                    height = dots[i][0] - dots[j][0];
                }
            }
        }

        return answer = Math.abs(width * height);
    }
}