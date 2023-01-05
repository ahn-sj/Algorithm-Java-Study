package study.jaeworkspace.baekjoon.w02;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 덱
 */
public class NO10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList();

        int commandCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCount; i++) {
            String[] command = br.readLine().split(" ");

            String rst = "";

            switch (command[0]) {
                case "push_front":
                    deque.addFirst(Integer.valueOf(command[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.valueOf(command[1]));
                    break;
                case "pop_front":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollFirst() + "\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    String empty = deque.isEmpty() == true ? "1" : "0";
                    bw.write(empty + "\n");
                    break;
                case "front":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.getFirst() + "\n");
                    break;
                case "back":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.getLast() + "\n");
                    break;
            }
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
