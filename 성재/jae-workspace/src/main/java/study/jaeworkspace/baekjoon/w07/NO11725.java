package study.jaeworkspace.baekjoon.w07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 트리의 부모 찾기
 */
public class NO11725 {

    static final int ROOT = 1;
    static int[] parents;
    static List<List<Integer>> tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());

        tree = new ArrayList<>();
        parents = new int[node + 1];

        setTree(node, tree);
        connectTree(br, node, tree);
        bfs(ROOT);
        printParentNode();

    }

    private static void printParentNode() {
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < parents.length; i++) {
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int root) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        parents[root] = root;

        while (!queue.isEmpty()) {
            Integer value = queue.poll();

            for (int item : tree.get(value)) {
                if(parents[item] == 0) {
                    parents[item] = value;
                    queue.add(item);
                }
            }
        }
    }

    private static void connectTree(BufferedReader br, int node, List<List<Integer>> tree) throws IOException {
        for (int i = 0; i < node - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            tree.get(start).add(end);
            tree.get(end).add(start);
        }
    }

    private static void setTree(int node, List<List<Integer>> tree) {
        for (int i = 0; i <= node; i++) {
            tree.add(new ArrayList<>());
        }
    }
}
