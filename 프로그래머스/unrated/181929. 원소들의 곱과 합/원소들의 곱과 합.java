class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = num_list[0];
        int multip = num_list[0];
        
        for (int i = 1; i < num_list.length; i++) {
            sum += num_list[i];
            multip *= num_list[i];
        }
        
        if ((sum * sum) > multip) {
            answer = 1;
        }
        
        return answer;
    }
}