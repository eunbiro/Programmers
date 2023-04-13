class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String rpc = my_string.replaceAll("[a-zA-z]", "");
        for (int i = 0; i < rpc.length(); i++) {
            answer += Integer.parseInt(rpc.substring(i, i + 1));
        }
        return answer;
    }
}