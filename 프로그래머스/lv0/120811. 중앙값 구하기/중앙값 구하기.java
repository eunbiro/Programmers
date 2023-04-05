class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num = array;
        int temp;
        
        for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (num[j] > num[j + 1]) {
                        temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }
            }
        
        return answer = array[array.length / 2];
    }
}