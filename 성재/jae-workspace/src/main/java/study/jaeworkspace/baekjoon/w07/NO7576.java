package study.jaeworkspace.baekjoon.w07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class NO7576 {
    static boolean[][] checked;
    static int[][] tomato;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int width;
    static int height;

    static int max = Integer.MIN_VALUE;;

    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] size = br.readLine().split(" ");
        width = Integer.parseInt(size[1]); // 세로
        height = Integer.parseInt(size[0]); // 가로

        tomato = new int[width][height];
        checked = new boolean[width][height];

        for (int i = 0; i < width; i++) {
            String[] toma = br.readLine().split(" ");

            for (int j = 0; j < height; j++) {
                int value = Integer.parseInt(toma[j]);
                tomato[i][j] = value;

                if(value == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
//        for (int[] ints : queue) {
//            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
//        }
        System.out.println(bfs());
    }

    private static int bfs() {


        while (!queue.isEmpty()) {
            int[] ints = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + ints[0];
                int nextY = dy[i] + ints[1];

                if(nextX >= 0 && nextY >= 0 && nextX < width && nextY < height) {
                    if(tomato[nextX][nextY] == 0) {
                        queue.add(new int[]{nextX, nextY});
                        tomato[nextX][nextY] = tomato[ints[0]][ints[1]] + 1;
                    }
                }
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (max < tomato[i][j]) {
                    max = tomato[i][j];
                }
                if (tomato[i][j] == 0) {
                    return -1;
                }
            }
        }
        return max - 1;
    }
}
