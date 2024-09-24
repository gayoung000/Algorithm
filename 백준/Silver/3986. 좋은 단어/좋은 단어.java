
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int cnt = 0;
        
        for (int tc = 0; tc < N; tc++) {
         
            String[] arr = br.readLine().trim().split("");
            Character[] words = new Character[arr.length];
            for(int c = 0; c < arr.length; c++) {
                words[c] = arr[c].charAt(0); 
            }
            
            Stack<Character> stack = new Stack<>();
            
            for (Character ch : words) {
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop(); 
                } else {
                    stack.push(ch); 
                }
            }

         
            if (stack.isEmpty()) {
                cnt++; 
            }
        }

        System.out.println(cnt);
    }
}