class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int chkNum1 = common[1] - common[0];
        int chkNum2 = common[2] - common[1];
        
        if (chkNum1 == chkNum2) {
        	answer = common[common.length - 1] + chkNum1;
        } else {
        	answer = common[common.length - 1] * (common[1] / common[0]);
		}

        return answer;
    }
}