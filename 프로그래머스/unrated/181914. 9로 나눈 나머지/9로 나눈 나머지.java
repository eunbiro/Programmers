class Solution {
    public int solution(String number) {
        int answer = 0;
        int numSum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            numSum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer = numSum % 9;
    }
}