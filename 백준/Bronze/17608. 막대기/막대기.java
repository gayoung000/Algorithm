
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		int cnt = 1;
		
		int N = Integer.parseInt(br.readLine().trim());
		
		for(int n = 0; n < N; n++) {
			int h = Integer.parseInt(br.readLine().trim());
			stack.push(h);
		}
		
		int target = stack.pop(); // 가장 마지막 원소
		
		while(stack.size() != 0) {
			int a = stack.pop();
			if(a > target) {
				target = a; // 기준 막대 h를 갱신 
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
