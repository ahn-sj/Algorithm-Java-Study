package study.jaeworkspace.baekjoon;

import java.util.Stack;

/**
 * 큐
 */
public class NO10845 {
    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.empty());

        System.out.println(queue.front());
        System.out.println(queue.back());
    }

    public static class CustomQueue {
        Stack<Integer> newStack = new Stack();
        Stack<Integer> oldStack = new Stack();

        public void push(int element) {
            newStack.push(element);
        }

        public int pop() {
            fillOldStack();
            return oldStack.pop();
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

            if(oldStack.empty()) return -1;

            return oldStack.firstElement();
        }

        public int back() {
            fillOldStack();

            if(oldStack.empty()) return -1;
            return oldStack.lastElement();
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
