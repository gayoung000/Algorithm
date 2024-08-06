
import java.util.*;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
         //System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc <= 10; tc++) {
  
            int n = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            
            String item = sc.nextLine().trim();
            
            Stack<Character> stack = new Stack<>();
            int result = 1;

            for (int i = 0; i < n; i++) {
                char c = item.charAt(i);

                if (c == '{' || c == '(' || c == '[' || c == '<') {
                    stack.push(c); 
                } else if (c == '}' || c == ')' || c == ']' || c == '>') {
                    if (stack.isEmpty() || !isMatchPair(stack.pop(), c)) {
                        result = 0; 
                        break;
                    }
                }
            }
            
            if (!stack.isEmpty()) {
                result = 0; 
            }

            System.out.println("#" + tc + " " + result);
        }
    }

    public static boolean isMatchPair(char open, char close) {
        switch (open) {
            case '(':
                return close == ')';
            case '{':
                return close == '}';
            case '[':
                return close == ']';
            case '<':
                return close == '>';
            default:
                return false;
        }
    }
    }
	
