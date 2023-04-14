class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[a-zA-Z]", "");
        int[] answer = new int[num.length()];
        for(int i = 0; i < num.length(); i++) {
            answer[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        
        for (int i = 0; i < num.length() - 1; i++) {
            for (int j = 0; j < num.length() - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        return answer;
    }
}