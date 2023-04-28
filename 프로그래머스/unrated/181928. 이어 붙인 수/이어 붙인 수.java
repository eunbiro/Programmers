class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String ansEven = "";
        String ansodd = "";
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                ansEven += num;
            } else {
                ansodd += num;
            }
        }
        
        answer = Integer.parseInt(ansodd) + Integer.parseInt(ansEven);
        return answer;
    }
}