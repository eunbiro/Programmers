class Solution {
    public int solution(int price) {
        int answer = 0;
        if (500000 <= price) {
            answer = price - (int) (Math.round(price * 0.2));
        } else if (300000 <= price && 500000 > price) {
            answer = price - (int) (Math.round(price * 0.1));
        } else if (100000 <= price && 300000 > price) {
            answer = price - (int) ((Math.round(price * 0.05)));
        } else if (100000 > price) {
            answer = (int) price;
        }
        return answer;
    }
}