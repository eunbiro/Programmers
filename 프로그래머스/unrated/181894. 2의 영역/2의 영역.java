class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        int[] answer;
        
        if (start == -1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[(end - start) + 1];
            int j = 0;
            for (int i = start; i <= end; i++) {
                answer[j] = arr[i];
                j++;
            }
        }
        
        return answer;
    }
}