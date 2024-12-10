
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine().trim());
		String[] arr = br.readLine().trim().split(" ");
		int[] Ai = new int[arr.length];
		
		String[] BC = br.readLine().trim().split(" ");
		int B = Integer.parseInt(BC[0]);
		int C = Integer.parseInt(BC[1]);
		
		for(int i = 0; i < arr.length; i++) {
			Ai[i] = Integer.parseInt(arr[i]);
		}
		
		long count = 0;
		
		for(int i = 0; i < Ai.length; i++) { 
			// 총감독 먼저 구하기
			count+=1;
			Ai[i] = Ai[i] - B;
			
			// 부감독 구하기 
			if(Ai[i] > 0) {
				int subDirNum = Ai[i] / C;
				count += subDirNum;
				if (Ai[i] % C > 0) { 
                    count += 1;
                }	
			}
		}
		
		System.out.println(count);
	}

}