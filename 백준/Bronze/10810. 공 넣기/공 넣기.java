

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] NM = br.readLine().trim().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
	
		int[]baskets = new int[N+1];
		
		for(int tc = 1; tc <= M; tc++) {
			String[] arr = br.readLine().trim().split(" ");		
			int start = Integer.parseInt(arr[0]);
			int end = Integer.parseInt(arr[1]);
			int num = Integer.parseInt(arr[2]);
			
			for(int i = start; i <= end; i++) {
				baskets[i] = num;
			}
			
		}
		
		for(int i = 1; i <= N; i++) {
			sb.append(baskets[i]).append(" ");
		}
		System.out.println(sb);
	}

}