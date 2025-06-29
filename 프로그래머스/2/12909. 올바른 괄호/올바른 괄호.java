import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] a = s.toCharArray();
    
        if(a[0] == ')') 
            return false;
         
        for(int i = 0; i < a.length; i++){
            if(stack.isEmpty()){
                stack.push(a[i]);
                continue;
            }
            
            char target = stack.pop();
            // if (target == a[i]) {
            //     stack.push(target);
            //     stack.push(a[i]);
            // }
            if (!(target == '(' && a[i] == ')')) {
                stack.push(target);
                stack.push(a[i]);
            }
            
        }
        
        boolean answer = (stack.isEmpty()) ? true : false ;

        return answer;
    }
}