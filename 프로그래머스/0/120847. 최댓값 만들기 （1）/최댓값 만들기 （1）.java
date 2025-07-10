import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int num = numbers.length;
        return numbers[num-1] * numbers[num-2];
    }
}