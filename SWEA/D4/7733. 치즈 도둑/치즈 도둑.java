import java.io.*;
import java.util.*;

public class Solution {
     
    static int N;  // 지도의 크기 N 선언
    static int T;  // 테스트 케이스 수
    static int[][] Map;  // 치즈 맵 배열 선언
    static int[][] visited;  // 방문 체크 배열

    // 방향 배열을 분리하여 상하좌우로 탐색할 수 있게 함
    static int[] dr = {-1, 1, 0, 0}; // 행 방향 (상, 하)
    static int[] dc = {0, 0, -1, 1}; // 열 방향 (좌, 우)
       
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 테스트 케이스 수 입력
        T = Integer.parseInt(br.readLine());
      
        // 테스트 케이스 수 만큼 반복
        for (int x = 0; x < T; x++) {
            N = Integer.parseInt(br.readLine());  // 지도 크기 입력
            
            Map = new int[N][N];  // 치즈 맵 배열 선언
            visited = new int[N][N];  // 방문 체크 배열
            
            // 치즈 맵 데이터 입력
            for (int i = 0; i < N; i++) {
                String[] A = br.readLine().split(" ");
                for (int j = 0; j < N; j++) Map[i][j] = Integer.parseInt(A[j]);
            }
             
            int Ans = 1;  // 정답 변수 (치즈 덩어리의 최대값)
             
            // 1일부터 99일까지 치즈가 녹는 상황을 고려
            for (int k = 1; k < 100; k++) {
                int cnt = 0;  // 치즈 덩어리의 개수를 카운트
                ArrayList<Integer> arr = new ArrayList<>();  // DFS를 위한 스택 역할을 하는 리스트
                
                // 지도 전체를 순회하면서 치즈 덩어리 탐색
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        // 현재 치즈가 k일째에 녹았다면 패스
                        if (Map[i][j] <= k) continue;
                        // 방문하지 않은 치즈 덩어리를 발견하면 탐색 시작
                        if (visited[i][j] == 0) {
                            visited[i][j] = 1;  // 현재 위치를 방문 처리
                            
                            // 리스트에 현재 위치 추가 - 2차원 좌표를 하나의 수로 바꾸어서 저장합니다.
                            arr.add(i * N + j); 
                            
                            cnt += 1;  // 새로운 덩어리 발견했으므로 개수 증가
                            
                            // DFS를 통해 연결된 치즈 덩어리 찾기
                            while (!arr.isEmpty()) {
                                int n = arr.remove(arr.size() - 1);  // 스택에서 하나 꺼냄
                                int p = n / N, q = n % N;  // 꺼낸 수를 2차원 좌표로 변환
                                 
                                // 4방향 탐색
                                for (int d = 0; d < 4; d++) {
                                    int np = p + dr[d], nq = q + dc[d]; // 분리된 방향 배열 사용
                                    // 범위 안에 있고 아직 방문하지 않았으며, k일에 치즈가 녹지 않았으면 탐색
                                    if (check(np, nq) && visited[np][nq] == 0 && Map[np][nq] > k) {
                                        visited[np][nq] = 1;  // 방문 처리
                                        arr.add(np * N + nq);  // 새로운 위치를 스택에 추가
                                    }
                                }
                            }
                        }
                    }
                }
                 
                // 최댓값을 업데이트
                Ans = Math.max(Ans, cnt);
                 
                // 방문 배열 초기화(다음 k일을 위해)
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) visited[i][j] = 0;
                }
            }
             
            // 결과를 저장 (테스트 케이스 번호와 최대 치즈 덩어리 개수 출력)
            sb.append(String.format("#%s %s\n", x + 1, Ans));
        }
         
        // 최종 결과 출력
        System.out.println(sb);
    }
    
    // 범위를 체크하는 함수
    static boolean check(int a, int b) {
        // 좌표가 유효한 범위에 있으면 true 반환
        return (0 <= a && a < N && 0 <= b && b < N);
    }
}
