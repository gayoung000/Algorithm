import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int F;
	static int S;
	static int G;
	static int U;
	static int D;
	static boolean[] visited;
	static int[] dir = {U, -D};
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().trim().split(" ");
		
		F = Integer.parseInt(arr[0]); // 총 층수 
		S = Integer.parseInt(arr[1]); // 현재 층수 
		G = Integer.parseInt(arr[2]); // 목표 층수 
		U = dir[0] = Integer.parseInt(arr[3]); // 위로 U층 
		D = dir[1] = Integer.parseInt(arr[4]); // 아래로 D층 
	
		visited = new boolean[F + 1];
        dir = new int[] {U, -D};
		
		int result = bfs(S);
		
		if (result == -1) {
			System.out.println("use the stairs");
		} else {
			System.out.println(result);
		}
	}


	private static int bfs(int S) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {S, 0});
		visited[S] = true;

		while(!queue.isEmpty()) {
			int[] cur = queue.poll();
			int curX = cur[0];
            int depth = cur[1]; 
			
			if(curX == G) {
				return depth;
			}
			
			for(int d = 0; d < 2; d++) {
				int nx = curX + dir[d];
				
				if(nx >= 1 && nx <= F && !visited[nx]) {
					visited[nx] = true;
					queue.add(new int[] {nx, depth + 1});
				}

			}
			
		}
		return -1;
		
		
	}
}
