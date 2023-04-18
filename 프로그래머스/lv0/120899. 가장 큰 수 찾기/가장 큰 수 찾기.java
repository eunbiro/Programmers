class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = array[0];
        answer[1] = 0;
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    answer[0] = array[j + 1];
                    answer[1] = j + 1;
                }
            }
        }
        
        return answer;
    }
}