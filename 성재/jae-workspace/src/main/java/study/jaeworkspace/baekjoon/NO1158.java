package study.jaeworkspace.baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 요세푸드 문제 (큐 활용)
 *
 * =======================================
 * ========= 나중에 다시 풀어보기 ===========
 * =======================================
 *
 */
public class NO1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList();

        int peopleCount = scan.nextInt();
        int gap = scan.nextInt();

        int[] peoples = new int[peopleCount - 1];

        addPeople(peopleCount, queue);

        int index = 0;

        while (queue.size() != 1) {
            // gap - 1 까지 맨 뒤로 보내기
            for (int i = 0; i < gap - 1; i++) {
                queue.offer(queue.poll());
            }
            peoples[index++] = queue.poll();
        }

        String arrayToStringPeople = Arrays.toString(peoples);
        System.out.println("<" + arrayToStringPeople.substring(1, arrayToStringPeople.length() - 1) + ", " + queue.poll() + ">");
    }

    private static void addPeople(int peopleCount, Queue<Integer> queue) {
        for (int i = 1; i <= peopleCount; i++) {
            queue.offer(i);
        }
    }
}
