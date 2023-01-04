package study.jaeworkspace.baekjoon.w01;

import java.io.*;
import java.util.Stack;

/**
 * 큐 (스택 2개로 큐 구현)
 */
public class NO10845_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCount = Integer.parseInt(br.readLine());

        CustomQueue queue = new CustomQueue();

        for (int i = 0; i < loopCount; i++) {
            String command = br.readLine();
            switch (command.split(" ")[0]) {
                case "push":
                    queue.push(Integer.parseInt(command.split(" ")[1]));
                    break;
                case "pop":
                    bw.write(queue.pop() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.empty() + "\n");
                    break;
                case "front":
                    bw.write(queue.front() + "\n");
                    break;
                case "back":
                    bw.write(queue.back() + "\n");
                    break;
            }
            bw.flush();
        }

        bw.close();
        br.close();
    }

    public static class CustomQueue {
        Stack<Integer> newStack = new Stack();
        Stack<Integer> oldStack = new Stack();

        public void push(int element) {
            newStack.push(element);
        }

        public int pop() {
            fillOldStack();
            return oldStack.empty() ? -1 : oldStack.pop();
        }

        public int size() {
            fillOldStack();
            return oldStack.size();
        }

        public int empty() {
            fillOldStack();
            return oldStack.empty() == true ? 1 : 0;
        }

        public int front() {
            fillOldStack();
            return oldStack.empty() ? -1 : oldStack.lastElement();
        }

        public int back() {
            fillOldStack();
            return oldStack.empty() ? -1 :oldStack.firstElement();
        }

        private void fillOldStack() {
            while (hasElement()) {
                Integer pop = newStack.pop();
                oldStack.push(pop);
            }
        }

        private boolean hasElement() {
            return !newStack.empty();
        }
    }
}
