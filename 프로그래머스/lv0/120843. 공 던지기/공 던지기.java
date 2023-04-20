class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idxNum = 1;
        
        while (k > 1) {
            idxNum += 2;
            if (numbers.length < idxNum) {
                idxNum = idxNum - (numbers.length);
            }
            k--;
        }
        return answer = numbers[idxNum - 1];
    }
}