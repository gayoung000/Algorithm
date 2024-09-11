

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("src/알고리즘스터디/A039_SWEA_1983_조교의성적매기기.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] arr = br.readLine().trim().split(" ");
            int N = Integer.parseInt(arr[0]); // 학생 수 
            int K = Integer.parseInt(arr[1]); // 학점 알고 싶은 학생의 번호 

            double[] scores = new double[N + 1]; // 성적을 저장할 배열
            double targetScore = 0;

            // 성적 계산해서 배열에 넣기 
            for (int i = 1; i <= N; i++) {
                String[] scoreArr = br.readLine().trim().split(" ");
                int midScore = Integer.parseInt(scoreArr[0]);
                int finalScore = Integer.parseInt(scoreArr[1]);
                int homeworkScore = Integer.parseInt(scoreArr[2]);

                double total = (midScore * 0.35) + (finalScore * 0.45) + (homeworkScore * 0.20);
                scores[i] = total;
            }

            // 성적을 오름차순으로 정렬한 배열 생성
            double[] rankArr = Arrays.copyOfRange(scores, 1, N + 1); 
            Arrays.sort(rankArr);

          
            int target = 0;
            for (int i = 0; i < rankArr.length; i++) {
                if (rankArr[i] == scores[K]) { 
                    target = i + 1; 
                    break;
                }
            }

      
            String result = calc(target, N);
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
       
        System.out.print(sb.toString());
    }

    static String calc(int target, int N) {
        int section = N / 10; // 각 등급의 학생 수
        int gradeIndex = (target - 1) / section; // 해당 등수의 학점 계산

        switch (gradeIndex) {
            case 9:
                return "A+";
            case 8:
                return "A0";
            case 7:
                return "A-";
            case 6:
                return "B+";
            case 5:
                return "B0";
            case 4:
                return "B-";
            case 3:
                return "C+";
            case 2:
                return "C0";
            case 1:
                return "C-";
            case 0:
                return "D0";
            default:
                return "D0";
        }
    }
}
