import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] WH = br.readLine().trim().split(" ");
        String[] PQ = br.readLine().trim().split(" ");
        
        int W = Integer.parseInt(WH[0]);
        int H = Integer.parseInt(WH[1]);
        int P = Integer.parseInt(PQ[0]); // x
        int Q = Integer.parseInt(PQ[1]); // y
        int T = Integer.parseInt(br.readLine());
        
        int xCnt = (P + T) / W; // T초 동안 P기준(x) W를 몇 번 움직였는지 
        int yCnt = (Q + T) / H; // T초 동안 Q기준(y) W를 몇 번 움직였는지  
        int x, y;
        
        if(xCnt % 2 == 0) { // 왼 -> 오 
        	x = 0 + (P + T) % W;
        } else { // 오 -> 왼 
        	x = W - ((P + T) % W);
        }
        
        if(yCnt % 2 == 0) { // 아래 -> 위  
        	y = 0 + (Q + T) % H;
        } else { // 위 -> 아래 
        	y = H - ((Q + T) % H);
        }
        
        sb.append(x).append(" ").append(y);
        bw.write(sb.toString());
        
        bw.close();
	}

}
