package study.jaeworkspace.baekjoon.w02;

import java.io.*;

public class NO11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tileSize = Integer.parseInt(br.readLine());
        int[] tiles = new int[1001];

        tiles[0] = 0;
        tiles[1] = 1;
        tiles[2] = 2;

        for (int i = 3; i < tiles.length; i++) {
            tiles[i] = (tiles[i - 1] + tiles[i - 2]) % 10007;
        }
        bw.write(tiles[tileSize] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
