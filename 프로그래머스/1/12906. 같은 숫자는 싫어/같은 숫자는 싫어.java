import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new LinkedList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            deque.addFirst(arr[i]);  
        }
        
        int size = deque.size();
        int[] answer = new int[deque.size()];
        for(int i = 0; i < size; i++){
            answer[i] = deque.removeLast();
        }

        return answer;
    }
}