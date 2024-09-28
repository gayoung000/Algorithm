import java.io.*;
import java.util.*;
   
public class Solution {
 
    public static void main(String[] args) throws IOException {
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
         
        // 테스트 케이스 수 입력 받음
        int T = Integer.parseInt(br.readLine());
         
        // 테스트 케이스 수 만큼 반복
        for (int x=0; x<T; x++) {
            // 첫 번째 줄에서 각 요금제의 비용을 입력받음 (일일, 월간, 3개월, 1년)
            String[] A = br.readLine().split(" ");
            int a = Integer.parseInt(A[0]); // 일일 이용권 가격
            int b = Integer.parseInt(A[1]); // 월간 이용권 가격
            int c = Integer.parseInt(A[2]); // 3개월 이용권 가격
            int d = Integer.parseInt(A[3]); // 1년 이용권 가격
             
            // 두 번째 줄에서 각 월별 이용 계획(수영장 이용 일수)을 입력받음
            A = br.readLine().split(" ");
            // dp 배열 선언 (1월부터 12월까지의 최소 비용을 저장)
            int[] dp = new int[13]; // dp[i]는 i월까지의 최소 비용
             
            // 1월부터 12월까지 최소 비용 계산
            for (int i=1; i<=12; i++) {
                // dp[i]는 이전 달의 최소 비용 + i월의 최소 비용 (일일권 vs 월간권)
                dp[i] = dp[i-1] + Math.min(Integer.parseInt(A[i-1]) * a, b);
                
                // 3개월권을 사용할 수 있는 경우 3개월권을 사용하는 것이 더 저렴한지 확인
                if (i >= 3) dp[i] = Math.min(dp[i], dp[i-3] + c);
            }
             
            // 1년 이용권과 12월까지의 최소 비용 중 더 저렴한 것을 결과에 추가
            sb.append(String.format("#%s %s\n", x+1, Math.min(d, dp[12])));
        }
     
    // 결과 출력
    System.out.println(sb);
     
    }
}