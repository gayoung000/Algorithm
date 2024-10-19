import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static Deque<Integer> x1 = new ArrayDeque<>();
	static Deque<Integer> y1 = new ArrayDeque<>();
	
	static int maxRain, minRain;
	
	static int[] dirX = {0, 0, -1, 1};
	static int[] dirY = {-1, 1, 0, 0};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		//minRain = Integer.MAX_VALUE;
		maxRain = Integer.MIN_VALUE;
		
		
		//map 입력 받기 
		for(int i = 0; i < N; i++) {
			String[] arr = br.readLine().trim().split(" ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(arr[j]);
				//minRain = Math.min(minRain, map[i][j]);
				maxRain = Math.max(maxRain, map[i][j]);
			}
		}
		
		int maxCnt = 0;
		
		//bfs 하기 
		for(int rain = 0; rain <= maxRain; rain++) {
			visited = new boolean[N][N]; // 각 테스트 케이스마다 visited 배열 초기화 
			int areaCnt = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(!visited[i][j] && map[i][j] > rain) {
						bfs(i, j, rain);
						areaCnt++;
					}
				}
			}
			maxCnt = Math.max(maxCnt, areaCnt);
		}
		System.out.println(maxCnt);

	}

	private static void bfs(int x, int y, int rain) {
		visited[x][y] = true;
		x1.offer(x);
		y1.offer(y);
		
		while(!x1.isEmpty() && !y1.isEmpty()) {
			int curX = x1.poll();
			int curY = y1.poll();
			
			for(int d = 0; d < 4; d++) {
				int nx = curX + dirX[d];
				int ny = curY + dirY[d];
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
					if(!visited[nx][ny] && map[nx][ny] > rain) {
						x1.offer(nx);
						y1.offer(ny);
						visited[nx][ny] = true;
					}
				}
			}
		}
		
	}

}
