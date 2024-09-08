
import java.util.*;
import java.io.*;


class Solution
{
	static int[] parents;
	
	static void makeSet(int N){
		parents = new int[N+1];
		for(int i = 1; i <= N; i++) {
			parents[i] = i;
		}
	}
	
	static int findParents (int n) {
		if(parents[n] == n) return n;
		return parents[n] = findParents(parents[n]);
	}
	
	static void union(int a, int b) {
		int A = findParents(a);
		int B = findParents(b);
		parents[B] = A;
	}
	
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("src/이가영/A065_SWEA_3289_서로소집합.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());		
		StringBuilder sb = new StringBuilder(100); 
	
		int T = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());			
			int N = Integer.parseInt(st.nextToken());			
			int M = Integer.parseInt(st.nextToken()); 
			
			makeSet(N);
			
			sb.append("#").append(tc).append(" ");
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int type = Integer.parseInt(st.nextToken());	
				int group1 = Integer.parseInt(st.nextToken());	
				int group2 = Integer.parseInt(st.nextToken());	
				
				if(type == 0) { // 합집합 
					if(findParents(group1) != findParents(group2)) {
						union(group1, group2);
					}
				} else {
					if(findParents(group1)==findParents(group2)) sb.append("1");			
					else sb.append("0");		
				}
				
			}
			sb.append("\n");
		} // tc
		
		System.out.println(sb);
	}
}