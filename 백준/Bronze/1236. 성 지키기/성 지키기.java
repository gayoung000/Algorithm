
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] castle = new char[N][M];
		boolean[] isXR = new boolean[N];
		boolean[] isXC = new boolean[M];
		
		int rowCnt = 0;
		int colCnt = 0;
		
		// 성 정보 입력 받기 
		for(int i = 0; i < N; i++) {
			String arr = br.readLine().trim();;
			for(int j = 0; j < M; j++) {
				castle[i][j] = arr.charAt(j);
				if (castle[i][j] == 'X') {
					isXR[i] = true;
					isXC[j] = true;
				}
			}
		}
		
        for (int i = 0; i < N; i++) {
            if (!isXR[i]) {
                rowCnt++;
            }
        }
        
        for (int j = 0; j < M; j++) {
            if (!isXC[j]) {
                colCnt++;
            }
        }
        
        System.out.println(Math.max(rowCnt, colCnt));
			
	}

}