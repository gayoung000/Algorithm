

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer>[] conn;
	static boolean[] visited;
	static int A, B; 
	static int count;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine().trim()); 
		conn = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
            conn[i] = new ArrayList<>();
        }
		
		
		String[] arr = br.readLine().trim().split(" ");
		
		A = Integer.parseInt(arr[0]); 
		B = Integer.parseInt(arr[1]);
		int m = Integer.parseInt(br.readLine().trim()); // 부모 자식들 간의 관계의 개수 : 간선갯수 
		
		for(int i = 0; i < m; i++) {
			arr = br.readLine().trim().split(" ");
			
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			conn[x].add(y);
			conn[y].add(x);
	
		}
		count = -1;
		
		visited = new boolean[n + 1];
		
		dfs(A, 0);
		
		System.out.println(count);
				
		
	
	}

	private static void dfs(int v, int depth) {
		visited[v] = true;
		if (v == B) {
            count = depth; 
            return;
        }

        for (int next : conn[v]) {
            if (!visited[next]) { 
                dfs(next, depth + 1);
            }
        }
  }

}