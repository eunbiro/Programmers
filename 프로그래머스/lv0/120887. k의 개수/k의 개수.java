class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a < j + 1; a++) {
            String strA = String.valueOf(a);
            for (int b = 0; b < strA.length(); b++) {
                if (strA.substring(b, b + 1).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}