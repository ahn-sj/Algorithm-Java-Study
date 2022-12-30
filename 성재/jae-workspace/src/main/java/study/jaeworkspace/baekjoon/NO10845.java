package study.jaeworkspace.baekjoon;

/**
 * 큐
 */
public class NO10845 {
    public static void main(String[] args) {

    }

    public static class CustomQueue {
        int[] queueFiller = new int[10001];
        int[] queueHandler = new int[10001];
        int size = 0;

        public void push(int element) {
            queueFiller[size] = element;
            size++;
        }

        public int pop() {
            return 0;
        }

        public int size() {
            return size;
        }

    }
}
