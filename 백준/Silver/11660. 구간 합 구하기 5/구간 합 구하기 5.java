import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().trim().split(" ");
        
        int N = Integer.parseInt(arr[0]); // 배열 크기 N 
        int M = Integer.parseInt(arr[1]); // 합 구하는 횟수 
        
        int[][] map = new int[N+1][N+1];
        int[][] prefixSum = new int[N+1][N+1];
        
        // 맵 입력 
        for(int i = 1; i <= N; i++) {
            arr = br.readLine().trim().split(" ");
            for(int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(arr[j-1]);
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] 
                            - prefixSum[i - 1][j - 1] + map[i][j];
            }
        }
        
        int[] xy1 = new int[2];
        int[] xy2 = new int[2];
        int mapSum = 0;
        int upperSum = 0;
        int sideSum = 0;
        int plusSum = 0;
        int cnt = 0;
        
        // prefixSum[i] = prefixSum[i-1] + numbers[i];
        // sum = prefixSum[end] + numbers[start-1];
        
        // x1, y1, x2, y2
        // 총 M줄에 걸쳐 (x1, y1)부터 (x2, y2)까지 합을 구해 출력
        for(int i = 0; i < M; i++) {
            arr = br.readLine().trim().split(" ");
            xy1[0] = Integer.parseInt(arr[0]); // x1
            xy1[1] = Integer.parseInt(arr[1]); // y1
            xy2[0] = Integer.parseInt(arr[2]); // x2
            xy2[1] = Integer.parseInt(arr[3]); // y2
            
            mapSum = prefixSum[xy2[0]][xy2[1]];
            
            upperSum = prefixSum[xy1[0]-1][xy2[1]];
            sideSum = prefixSum[xy2[0]][xy1[1]-1];
            plusSum = prefixSum[xy1[0]-1][xy1[1]-1];
            
            cnt = mapSum - upperSum - sideSum + plusSum;
            
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
        
  }