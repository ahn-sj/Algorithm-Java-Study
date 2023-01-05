package study.jaeworkspace.baekjoon.w01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 스택
 */
public class NO10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());

        CustomStack stack = new CustomStack();

        for (int i = 0; i < loopCount; i++) {
            String command = br.readLine();
            switch (command) {
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
                default: // push N
                    stack.push(Integer.parseInt(command.split(" ")[1]));
                    break;
            }
        }
        br.close();
    }

    public static class CustomStack {
        int[] box = new int[10001];
        int size = 0;

        public void push(int element) {
            box[size] = element;
            size++;
        }

        public int pop() {
            if(size == 0) {
                return -1;
            }
            int temp = box[size - 1];
            box[size - 1] = 0;
            size--;
            return temp;
        }

        public int size() {
            return size;
        }

        public int empty() {
            return size <= 0 ? 1 : 0;
        }

        public int top() {
            return size <= 0 ? -1 : box[size - 1];
        }
    }
}
