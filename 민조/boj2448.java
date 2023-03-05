import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static char[][] c = new char[7000][7000];

    static void go(int x, int y, int n) {
        if (n == 3) {
            c[x][y] = c[x + 1][y - 1] = c[x + 1][y + 1]
                    = c[x + 2][y - 2] = c[x + 2][y - 1] = c[x + 2][y]
                    = c[x + 2][y + 1] = c[x + 2][y + 2] = '*';
            return;
        }
        int n2 = n / 2;
        go(x, y, n2);
        go(x + n2, y - n2, n2);
        go(x + n2, y + n2, n2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 7000; i++) {
            for (int j = 1; j < 7000; j++) {
                c[i][j] = ' ';
            }
        }
        if (n == 3) {
            go(1, 3, 3);

        } else {
            int n2 = n / 2;
            go(1, n, n2);
            go(n2 + 1, n2, n2);
            go(n2 + 1, n2 * 3, n2);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                bw.write(c[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }


}
