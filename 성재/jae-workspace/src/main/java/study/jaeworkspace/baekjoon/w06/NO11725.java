package study.jaeworkspace.baekjoon.w06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 트리의 부모 찾기
 */
public class NO11725 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] parents;
    static int node;

    static StringBuilder sb = new StringBuilder();

    static final int START = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());



        node = Integer.parseInt(st.nextToken());
        parents = new int[node + 1];

        createGraph();
        connectGraph(br);

        bfs();

        printParents();
    }

    private static void connectGraph(BufferedReader br) throws IOException {
        for (int i = 0; i < node - 1; i++) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(stt.nextToken());
            int col = Integer.parseInt(stt.nextToken());

            graph.get(row).add(col);
            graph.get(col).add(row);
        }
    }

    private static void createGraph() {
        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }
    }

    private static void printParents() {
        for (int i = 2; i < parents.length; i++) {
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(START);
        parents[START] = START;

        while (hasElement(queue)) {
            int value = queue.poll();

            for (int item : graph.get(value)) {
                if(parents[item] == 0) {
                    parents[item] = value;
                    queue.offer(item);
                }
            }
        }
    }

    private static boolean hasElement(Queue<Integer> queue) {
        return !queue.isEmpty();
    }
}
