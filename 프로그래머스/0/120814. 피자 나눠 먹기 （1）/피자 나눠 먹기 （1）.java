class Solution {
    public int solution(int n) {
        int pizza = n / 7;
        if(1 <= n && n <= 7){
            return 1;
        } else if (n % 7 == 0){
            return n / 7;
        } else {
            return pizza + 1;
        }
    }
}
