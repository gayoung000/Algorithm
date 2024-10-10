

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	
	// 오, 하, 왼, 상 
	static int[] dirX = {0, 1, 0, -1}; // 추가 이동 
	static int[] dirY = {1, 0, -1, 0}; // 추가 이동 
	static int[][] visited;
	
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append("\n");
			int N = Integer.parseInt(br.readLine());
			
			int[][] map = new int[N][N];
			int[][] visited = new int[N][N];
			
			int cnt = 0;
			int x = 0;
			int y = 0;
			int dir = 0; 
			
			
			for(int i = 0; i < N * N; i++) {
				map[x][y] = ++cnt;
				visited[x][y] = 1;
				
				int nx = x + dirX[dir]; // 이동 
				int ny = y + dirY[dir]; // 이동 
				
				if(nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny] != 0) { 
					dir = (dir + 1) % 4; 
					nx = x + dirX[dir]; // 새로운 이동 
					ny = y + dirY[dir]; // 새로운 이동 
				} 
				
				x = nx;
				y = ny;
			}
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					sb.append(map[r][c]+ " ");
				}
				sb.append("\n");
			}
			
			
			
		} // tc
		System.out.println(sb);
		br.close();
	
	}
	
}
