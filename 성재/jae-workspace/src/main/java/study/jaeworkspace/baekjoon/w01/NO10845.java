package study.jaeworkspace.baekjoon.w01;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 큐
 */
public class NO10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<String> queue = new LinkedList();
        StringTokenizer st;

        String last = "";

        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    String pushElement = st.nextToken();
                    last = pushElement;
                    queue.offer(pushElement);
                    break;
                case "pop":
                    if (hasElement(queue)) {
                        bw.write(queue.poll() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(hasElement(queue)) {
                        bw.write("0\n");
                    } else {
                        bw.write("1\n");
                    }
                    break;
                case "front":
                    if (hasElement(queue)) {
                        bw.write(queue.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if (hasElement(queue)) {
                        bw.write(last + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
            bw.flush();
        }
    }

    private static boolean hasElement(Queue<String> queue) {
        return !queue.isEmpty();
    }
}
