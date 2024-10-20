
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int N;
	static int[][] visited;
	static int[][] map; 
	static int cnt, num; // 단지 내 개수, 단지 번호 
	static ArrayList<Integer> groupList = new ArrayList<>();
	
	static int[] dirX = {-1, 1, 0, 0};
	static int[] dirY = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		cnt = 0;
		
		map = new int[N][N];
		visited = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String arr = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = arr.charAt(j) - '0';
			}
		}
		
		// dfs 및 출력 
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(visited[i][j] == 0 && map[i][j] == 1) {
					cnt = 0;
					num++;
					dfs(i, j);	
					groupList.add(cnt);
				}
			}
		}
		
		Collections.sort(groupList);
		sb.append(num).append("\n");
		
		for(int num : groupList) {
			sb.append(num + "\n");
		}
		System.out.println(sb.toString());
	}

	private static void dfs(int x, int y) {
		visited[x][y] = 1;
		map[x][y] = num;
		cnt++;
		
		for(int d = 0; d < 4; d++) {
			int nx = x + dirX[d];
			int ny = y + dirY[d];
			
			if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
				if(visited[nx][ny] == 0 && map[nx][ny] == 1) {
					visited[nx][ny] = 1;
					map[nx][ny] = num;
					dfs(nx, ny);
				}
			}
		}
	}	
}
