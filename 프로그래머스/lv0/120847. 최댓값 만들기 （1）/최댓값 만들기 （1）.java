class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[i + 1] > answer) {
                    answer = numbers[i] * numbers[i + 1];
                }
            }
        }
        return answer;
    }
}