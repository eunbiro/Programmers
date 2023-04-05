class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 1;
        int maxCount = 0;
        int maxNum = 0;
        int same = 0;
        int chk = -1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (chk == array[i]) {
                cnt++;
            } else {
                chk = array[i];
                cnt = 1;
            }
            if (maxCount < cnt) {
                maxCount = cnt;
                maxNum = array[i];
                same = 0;
            } else if (maxCount == cnt) {
                same = -1;
            }
        }

        if (same == -1) {
            answer = -1;
        } else {
            answer = maxNum;
        }
        return answer;
    }
}