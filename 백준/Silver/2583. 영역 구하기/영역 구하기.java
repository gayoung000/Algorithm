import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1}; // 상, 우, 하, 좌
    static int[] dy = {1, 0, -1, 0}; // 상, 우, 하, 좌

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt(); 

        map = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }
        ArrayList<Integer> areas = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    areas.add(dfs(i, j));
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size()); 
        for (int area : areas) {
            System.out.print(area + " ");
        }
    }

    static int dfs(int x, int y) {
        visited[x][y] = true;
        int size = 1; 

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N) { 
                if (!visited[nx][ny] && map[nx][ny] == 0) { 
                    size += dfs(nx, ny);
                }
            }
        }
        return size;
    }
}
