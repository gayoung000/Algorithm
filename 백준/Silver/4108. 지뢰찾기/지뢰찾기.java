
import java.io.*;
import java.util.*;

public class Main {
	static char[][] bombMap;
	static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1}; // 행 
	static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1}; // 열 
	static String[] zero = {"0", "0"};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			 
			if(R==0 && C==0) break;
			
			
			bombMap = new char[R][C];
			
			for(int i = 0; i < R; i++) {
				String arr = br.readLine().trim();
				for(int j = 0; j < C; j++) {
					bombMap[i][j] = arr.charAt(j);
				}
			}
			
			// 배열 돌면서 지뢰 세기 
			for(int r = 0; r < R; r++) {	
				for(int c = 0; c < C; c++) {
					if(bombMap[r][c] == '.') {
						int count = 0;
						for(int d = 0; d < 8; d++) {
							int nr = r + dr[d] ;
							int nc = c + dc[d] ;
							
							// 범위 체크 
							if(nr < 0 || nr >= R || nc < 0 || nc >= C) continue;
							
							if(bombMap[nr][nc] == '*') count++;
							
						}
						sb.append(count);
						
					} else sb.append('*');
					
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}

}