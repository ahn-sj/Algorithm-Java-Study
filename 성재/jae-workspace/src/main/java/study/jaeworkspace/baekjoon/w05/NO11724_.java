package study.jaeworkspace.baekjoon.w05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 연결 요소의 개수 (bfs + 인접 리스트)
 */
public class NO11724_ {
    static ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    static boolean[] checked;
    static int node;
    static int line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        checked = new boolean[node + 1];

        for (int i = 0; i < node + 1; i++) {
            matrix.add(new ArrayList<>());
        }

        for (int i = 0; i < line; i++) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(stt.nextToken());
            int col = Integer.parseInt(stt.nextToken());

            matrix.get(row).add(col);
            matrix.get(col).add(row);
        }

        int cc = 0;
        for (int i = 1; i <= node; i++) {
            if(!checked[i]) {
                bfs(i);
                cc++;
            }
        }
        System.out.println(cc);

        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(i + " matrix = " + matrix.get(i));
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        checked[start] = true;

        while (hasElement(queue)) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Integer value = queue.poll();

                for (Integer integer : matrix.get(value)) {
                    if(!checked[integer]) {
                        queue.offer(integer);
                        checked[integer] = Boolean.TRUE;
                    }
                }
            }
        }
    }

    private static boolean hasElement(Queue<Integer> queue) {
        return !queue.isEmpty();
    }
}
