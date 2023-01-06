package study.jaeworkspace.baekjoon.w02;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 에디터
 */
public class NO1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> linkedList = new LinkedList<>();

        char[] initInputTexts = br.readLine().toCharArray(); // abcd
        for (Character character : initInputTexts) {
            linkedList.offer(character);
        }

        // 인덱스(리터럴) +3 != 이터레이터 (포인터) +1+1+1
        // LinkedList +3을 해도 결국 O(n)
        ListIterator<Character> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            iterator.next(); // Character 타입의 a b c d를 반환
        }

        int commandLine = Integer.parseInt(br.readLine()); // 3

        for (int i = 0; i < commandLine; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "L":
                    if(iterator.hasPrevious()) iterator.previous();
                    break;
                case "D":
                    if(iterator.hasNext()) iterator.next();
                    break;
                case "B":
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case "P":
                    iterator.add(command[1].charAt(0));
                    break;
            }
        }

        // String >> StringBuilder
        // String            불변
        // StringBuilder non-불변
        // => 매번 연산을 해줘서 연산 시간이 발생
        for (Character character : linkedList) {
            bw.write(character);
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
