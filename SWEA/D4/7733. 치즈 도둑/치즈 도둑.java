

import java.io.*;
import java.util.*;

public class Solution {

	static StringBuilder sb = new StringBuilder();
	static Deque<Integer> x1 = new ArrayDeque<>();
	static Deque<Integer> y1 = new ArrayDeque<>();
	
	static int[][] cheese;
	static boolean[][] visited;
	
	static int maxCount;
	static int maxCheese, minCheese;
	
	static int N;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
 
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("src/이가영/A063_SWEA_7733_치즈도둑.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine()); // 치즈 한 변의 길이  
			cheese = new int[N][N];
			minCheese = Integer.MAX_VALUE;
			maxCheese = Integer.MIN_VALUE;
			
			// cheese 입력 받기 
			for(int i = 0; i < N; i++) {
				String[] arr = br.readLine().trim().split(" "); // 공백으로 나눠서 정수 배열로 변환
				for(int j = 0; j < N; j++) {
					cheese[i][j] = Integer.parseInt(arr[j]);
					maxCheese = Math.max(maxCheese, cheese[i][j]);
					minCheese = Math.min(minCheese, cheese[i][j]);
				}
			} // cheese
			
			maxCount = 1;
			
			for(int day = minCheese; day <= maxCheese; day++) {
				visited = new boolean[N][N]; // 각 테스트 케이스마다 visited 배열 초기화 
				int areaCount = 0;
				for(int r = 0; r < N; r++) {
					for(int c = 0; c < N; c++) {
						if(cheese[r][c] > day && !visited[r][c]) { // 치즈와 해당일이 같다면
							// visited 방문했다고 입력
							bfs(r, c, day);
							areaCount++;
						}
					}
				}
				maxCount = Math.max(maxCount, areaCount);
				
			}
			sb.append("#").append(tc).append(" ").append(maxCount).append("\n");
			
			
			
			// 
			// 최소, 최대 만들고 각 배열에서 최소 최대만큼만 루프 돌기 
			// 1. 1일차 
			// 해당일자의 값을 만나면 -> visited가 true가 된다.
			// arrCount가 증가한다. 
			
			
			
		}//tc
		System.out.println(sb.toString());

	}//main

	private static void bfs(int x, int y, int day) {
		x1.offer(x);
		y1.offer(y);
		visited[x][y] = true;
		
		while(!x1.isEmpty() && !y1.isEmpty()) {
			int curX = x1.poll();
			int curY = y1.poll();
			
			for(int d = 0; d < 4; d++) {
				int nr = curX + dr[d];
				int nc = curY + dc[d];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if(!visited[nr][nc] && cheese[nr][nc] > day) {
						x1.offer(nr);
						y1.offer(nc);
						visited[nr][nc] = true;
					}
				}
			}
		}
		
	}

}
