import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
//         int max = 0;
//         int n = 0;
//         for(int i = 0; i < numbers.length; i++){
//             if (i+1 <= numbers.length){
//                 n = numbers[i] * numbers[i+1];
//                 if (n >= max){
//                 max = n;
//                 }
//             }
//         }
        
        Arrays.sort(numbers);
        
        int num1 = numbers[numbers.length - 1];
        int num2 = numbers[numbers.length - 2];
            
        
        return num1*num2;
    }
}