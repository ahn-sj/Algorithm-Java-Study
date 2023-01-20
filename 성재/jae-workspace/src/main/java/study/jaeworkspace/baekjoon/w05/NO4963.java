package study.jaeworkspace.baekjoon.w05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 섬의 개수
 */
public class NO4963 {

    static int dx[] = {0, -1, 0, 1, 1, 1, -1, -1};
    static int dy[] = {1, 0, -1, 0, 1, -1, -1, 1};

    static int[][] map;
    static boolean[][] checked;

    static int width;
    static int height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = "";

        while(!(str = br.readLine()).equals("0 0")) { // 0 0 이 아닌 경우 반복
            st = new StringTokenizer(str);

            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());

            checked = new boolean[height][width];
            map = new int[height][width];

            for (int i = 0; i < height; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < width; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println(Arrays.deepToString(map));

            int island = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if(!checked[i][j] && map[i][j] == 1) {
                        bfs(i, j);
                        island++;
                    }
                }
            }
        }
        br.close();
    }

    private static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        checked[x][y] = true;
        queue.offer(new Node(x, y));

        while (hasElement(queue)) {
            Node node = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                int curX = dx[i] + node.x;
                int curY = dy[i] + node.y;

//                if(curY >= 0 &)


            }
        }
    }

    private static boolean hasElement(Queue<Node> queue) {
        return !queue.isEmpty();
    }

    private static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
