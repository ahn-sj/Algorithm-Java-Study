package study.jaeworkspace.baekjoon.w01;

import java.io.*;
import java.util.*;

/**
 * 요세푸드 문제 (큐 활용)
 *
 * =======================================
 * ========= 나중에 다시 풀어보기 ===========
 * =======================================
 *
 */
public class NO1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList();
        StringBuilder rst = new StringBuilder();

        int peopleCount = Integer.parseInt(st.nextToken());
        int gap = Integer.parseInt(st.nextToken());

        addPeople(peopleCount, queue);

        rst.append("<");
        while (queue.size() != 1) {
            // gap - 1 까지 맨 뒤로 보내기
            for (int i = 0; i < gap - 1; i++) {
                queue.offer(queue.poll());
            }
            rst.append(queue.poll() + ", ");
        }
        rst.append(queue.poll() + ">");

        bw.write(rst + "\n");
        bw.flush();

        bw.close();
        br.close();
    }

    private static void addPeople(int peopleCount, Queue<Integer> queue) {
        for (int i = 1; i <= peopleCount; i++) {
            queue.offer(i);
        }
    }
}
