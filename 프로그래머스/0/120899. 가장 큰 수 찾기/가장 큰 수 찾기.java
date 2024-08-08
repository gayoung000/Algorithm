import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        
        int[] array2 = array.clone();
        Arrays.sort(array2);
        int target = array2[array.length - 1];
        int index = 0;
        
        
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                index = i;
                break;
            }
        }
        
        int[] result = {target, index};
        return result;
    }
}