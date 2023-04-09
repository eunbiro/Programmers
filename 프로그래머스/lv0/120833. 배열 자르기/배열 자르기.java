class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int idx = (num2 - num1) + 1;
        int[] answer = new int[idx];
        int j = 0;
        
        for (int i = num1; i < num2 + 1; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}