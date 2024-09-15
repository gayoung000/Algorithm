
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static char[][] chessboard = new char[8][8];
	static int[][] colorboard = new int[8][8]; 
	static boolean isWhite = true;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 8; i++) {
			String[] arr = br.readLine().trim().split(""); 
			for(int j = 0; j < 8; j++) {
				chessboard[i][j] = arr[j].charAt(0); 
			}
		}
		 
		for(int i = 0; i < 8; i+=2) {
			for (int j = 0; j < 8; j++) {
				if(isWhite) colorboard[i][j] = 1;
				else colorboard[i][j] = 0;			
				isWhite = !isWhite;
			}
		}
		
		isWhite = false;
		
		for(int i = 1; i < 8; i+=2) {
			for (int j = 0; j < 8; j++) {
				if(isWhite) colorboard[i][j] = 1;
				else colorboard[i][j] = 0;	
				isWhite = !isWhite;
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(colorboard[i][j] == 1) {
					if(chessboard[i][j] == 'F') count++;
				}
			}
		}
		
		System.out.println(count);
	
	} //main
}
