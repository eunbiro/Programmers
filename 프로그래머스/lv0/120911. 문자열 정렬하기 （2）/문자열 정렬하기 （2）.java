class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_strings = new char[my_string.length()];
        my_string = my_string.toLowerCase();
        
        for (int i = 0; i < my_string.length(); i++) {
            my_strings[i] = my_string.charAt(i);
        }
        
        for (int i = 0; i < my_strings.length - 1; i++) {
            for (int j = 0; j < my_strings.length - 1; j++) {
                if (my_strings[j] > my_strings[j + 1]) {
                    char temp = my_strings[j];
                    my_strings[j] = my_strings[j + 1];
                    my_strings[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i];
        }
        
        return answer;
    }
}