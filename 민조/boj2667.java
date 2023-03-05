import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n, cnt;
    static String[] s = new String[25];
    static int[][] c = new int[25][25];
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void dfs(int x, int y, int num) {
        c[x][y] = num;
        cnt++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (s[nx].charAt(ny) == '1' && c[nx][ny] == 0) {
                dfs(nx, ny, num);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i].charAt(j) == '1' && c[i][j] == 0) {
                    cnt = 0;
                    dfs(i, j, num++);
                    ans.add(cnt);
                }
            }
        }
        Collections.sort(ans);
        bw.write((num-1)+"\n");
        for(int x : ans)bw.write(x+"\n");

        br.close();
        bw.flush();
        bw.close();


    }


}


