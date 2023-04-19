class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int maxNum = Math.abs(array[0] - n);
        
        for (int i = 0; i < array.length; i++) {
            if (maxNum > Math.abs(array[i] - n)) {
                maxNum = Math.abs(array[i] - n);
                answer = array[i];
            } else if (maxNum == Math.abs(array[i] - n)) {
                answer = answer > array[i] ? array[i] : answer;
            }
        }
        return answer;
    }
}