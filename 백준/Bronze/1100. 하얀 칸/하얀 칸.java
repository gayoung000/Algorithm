

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static char[][] chessboard = new char[8][8];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 8; i++) {
            String[] arr = br.readLine().trim().split(""); 
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = arr[j].charAt(0);
            }
        }
        
        int count = 0;

        for(int i = 0; i < 8; i++) {
        	boolean isWhite = (i%2 == 0);
        	for(int j = 0; j < 8; j++) {
        		if(isWhite && chessboard[i][j] == 'F') count++;
        		isWhite = !isWhite;
        	}
        }

        System.out.println(count);
    }
}