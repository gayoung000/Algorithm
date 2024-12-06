
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] NM = br.readLine().trim().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
	
		int[] baskets = new int[N+1];
		
		for(int i = 0; i <= N; i++) {
			baskets[i] = i;
		}
		
		for(int tc = 1; tc <= M; tc++) {
			String[] arr = br.readLine().trim().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int temp;
			temp = baskets[a];
			baskets[a] = baskets[b];
			baskets[b] = temp;
		}
		
		for(int i = 1; i <= N; i++) {
			sb.append(baskets[i]).append(" ");
		}
		
		System.out.println(sb);

	}

}
