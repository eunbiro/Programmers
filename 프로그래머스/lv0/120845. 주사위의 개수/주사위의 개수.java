class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int boxX = box[0] / n;
        int boxZ = box[1] / n;
        int boxY = box[2] / n;
        answer = boxX * boxZ * boxY;
        return answer;
    }
}