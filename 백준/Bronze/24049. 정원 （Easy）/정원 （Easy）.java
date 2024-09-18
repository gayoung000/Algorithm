
import java.io.*;

public class Main {
	
	static int[][] garden; 

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NM = br.readLine().trim().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		garden = new int[N+1][M+1];
		
		String[] arr1 = br.readLine().trim().split(" "); 
		for(int r = 1; r < N+1; r++) {
			garden[r][0] = Integer.parseInt(arr1[r-1]);
		}
		
		String[] arr2 = br.readLine().trim().split(" ");
		for(int c = 1; c < M+1; c++) {
			garden[0][c] = Integer.parseInt(arr2[c-1]);
		}
		
		
		// 꽃 심기 
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < M+1; j++) {
				int row = garden[i-1][j];
				int col = garden[i][j-1];	
				
				if(row == col) {
					garden[i][j] = 0;
				} else { 
					garden[i][j] = 1;
				}
			}		
		}
		
		System.out.println(garden[N][M]);
		
	}

}