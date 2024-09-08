
import java.io.*;
import java.util.*;


class Solution
{
    static Deque<Character> dq = new ArrayDeque<>();
	static HashSet<Integer> set = new HashSet<>();
	static int N, K;

    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int tc = 1; tc <= T; tc++) {
			String[] arr = br.readLine().trim().split(" ");
			
			N = Integer.parseInt(arr[0]); 
			K = Integer.parseInt(arr[1]); 
			
			String str = br.readLine().trim();
			
			dq.clear(); 
            set.clear();
			
			for(int i = 0; i < N; i++) {
				dq.offer(str.charAt(i)); 
					
			}

			for(int turn = 0; turn < N/4; turn++) {
				char el = dq.pollLast();
				dq.offerFirst(el);
				makeDecimal();
			}
			
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list, Collections.reverseOrder());
            
            int result = list.get(K - 1);
            
			sb.append("#").append(tc).append(" ").append(result).append("\n");
		} 
		System.out.println(sb.toString());
        bw.close();
        br.close();
	}
    
    private static void makeDecimal() {
		Object[] tempQ = dq.toArray();

		for (int i = 0; i < N; i += (N / 4)) {
			String hex = "";
			for (int j = 0; j < N / 4; j++) hex += tempQ[i + j];
			set.add(Integer.parseInt(hex, 16));
		}
		
	}

}