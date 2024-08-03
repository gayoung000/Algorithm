class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int number : numbers ){
            sum += number;
        }
        
        double sum2 = (double) sum;
        double result = sum2 / numbers.length;
        return result;
    }
}