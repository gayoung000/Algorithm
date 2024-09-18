
import java.io.*;
import java.util.*;

public class Main {

    static int[][] TTT = new int[3][3];
    static boolean order;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int player = Integer.parseInt(st.nextToken().trim());
        
        order = (player == 1);
        
        for(int i = 0; i < 9; i++) {    
            st = new StringTokenizer(br.readLine().trim());
            int R = Integer.parseInt(st.nextToken()) - 1; 
            int C = Integer.parseInt(st.nextToken()) - 1;

            TTT[R][C] = OX(order);

            if(checkWin()) {
                System.out.println(TTT[R][C]);
                return;
            }

            order = !order;
        }
    
        System.out.println(0);
        
    } // main
    
    private static int OX (boolean order) {
        return order ? 1 : 2;
    }

    // 승리 조건을 체크하는 함수
    private static boolean checkWin() {
        // 상하 체크 
        for (int i = 0; i < 3; i++) {
            if (TTT[i][0] != 0 && TTT[i][0] == TTT[i][1] && TTT[i][1] == TTT[i][2]) {
                return true;
            }
           
            if (TTT[0][i] != 0 && TTT[0][i] == TTT[1][i] && TTT[1][i] == TTT[2][i]) {
                return true;
            }
        }
        
        // 대각선 체크
        if (TTT[0][0] != 0 && TTT[0][0] == TTT[1][1] && TTT[1][1] == TTT[2][2]) {
            return true;
        }
        if (TTT[0][2] != 0 && TTT[0][2] == TTT[1][1] && TTT[1][1] == TTT[2][0]) {
            return true;
        }
        
        return false;
    }

}
