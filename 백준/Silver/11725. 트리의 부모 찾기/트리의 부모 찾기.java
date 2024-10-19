
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	
	static boolean[] visited;
	static List<Integer>[] adjList;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); // 노드의 갯수 
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
		
		for(int i = 0; i < N-1; i++) {
			String[] arr = br.readLine().trim().split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			
			adjList[A].add(B);
            adjList[B].add(A); 	
		}
		
		int[] parents = new int[N + 1]; // 부모 정보 저장 
        visited = new boolean[N + 1]; 

        bfs(1, adjList, parents, visited); // 루트 1부터 시작

        for (int i = 2; i <= N; i++) {
            sb.append(parents[i]).append("\n");
        }
        System.out.print(sb);
    }

	private static void bfs(int root, List<Integer>[] adjList, int[] parents, boolean[] visited) {
		
		Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        visited[root] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : adjList[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parents[next] = cur; 
                    queue.offer(next);
                }
            }
        }
	}
				
	}


