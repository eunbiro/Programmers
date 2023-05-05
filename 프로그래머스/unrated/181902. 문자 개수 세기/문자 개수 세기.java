import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        Map<Integer, String> map = new HashMap<>();
        
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        map.put(6, "G");
        map.put(7, "H");
        map.put(8, "I");
        map.put(9, "J");
        map.put(10, "K");
        map.put(11, "L");
        map.put(12, "M");
        map.put(13, "N");
        map.put(14, "O");
        map.put(15, "P");
        map.put(16, "Q");
        map.put(17, "R");
        map.put(18, "S");
        map.put(19, "T");
        map.put(20, "U");
        map.put(21, "V");
        map.put(22, "W");
        map.put(23, "X");
        map.put(24, "Y");
        map.put(25, "Z");
        
        map.put(26, "a");
        map.put(27, "b");
        map.put(28, "c");
        map.put(29, "d");
        map.put(30, "e");
        map.put(31, "f");
        map.put(32, "g");
        map.put(33, "h");
        map.put(34, "i");
        map.put(35, "j");
        map.put(36, "k");
        map.put(37, "l");
        map.put(38, "m");
        map.put(39, "n");
        map.put(40, "o");
        map.put(41, "p");
        map.put(42, "q");
        map.put(43, "r");
        map.put(44, "s");
        map.put(45, "t");
        map.put(46, "u");
        map.put(47, "v");
        map.put(48, "w");
        map.put(49, "x");
        map.put(50, "y");
        map.put(51, "z");
        
        for (int i = 0; i < 52; i++) {
            String chrStr = String.valueOf(map.get(i));
            answer[i] = my_string.length() - my_string.replaceAll(chrStr, "").length();
        }
        return answer;
    }
}