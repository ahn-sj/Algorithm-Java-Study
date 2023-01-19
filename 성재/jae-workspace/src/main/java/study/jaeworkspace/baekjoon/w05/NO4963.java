package study.jaeworkspace.baekjoon.w05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 섬의 개수
 */
public class NO4963 {

    static int dx[] = {0, -1, 0, 1, 1, 1, -1, -1};
    static int dy[] = {1, 0, -1, 0, 1, -1, -1, 1};

    static int[][] map;
    static boolean[][] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = "";

        while(!(str = br.readLine()).equals("0 0")) { // 0 0 이 아닌 경우 반복
            st = new StringTokenizer(str);

            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            checked = new boolean[height][width];

            for (int i = 0; i < height; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < width; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            }

    }
}
