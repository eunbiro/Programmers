import java.util.Scanner;

public class Solution {
	public static String solution(String a) {
		String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char chk = a.charAt(i);

            if (chk < 97) {
            	answer += String.valueOf(chk).toLowerCase();
            } else {
            	answer += String.valueOf(chk).toUpperCase();
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(solution(a));
    }
}