package study.jaeworkspace.baekjoon.w02;

import java.io.*;
import java.util.LinkedList;

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
        int index = initInputTexts.length;

        int commandLine = Integer.parseInt(br.readLine()); // 3

        for (int i = 0; i < commandLine; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "L":
                    if(index != 0) index--;
//                    System.out.println("L: index = " + index);
                    break;
                case "D":
                    if(index != linkedList.size()) index++;
//                    System.out.println("D: index = " + index);
                    break;
                case "B":
                    if(index != 0) linkedList.remove(index - 1);
//                    System.out.println(linkedList);
                    break;
                case "P":
                    linkedList.add(index++, command[1].charAt(0));
                    break;
            }
        }

        String rst = "";

        for (Character character : linkedList) {
            rst += character;
        }
        bw.write(rst);
        bw.flush();

        bw.close();
        br.close();
    }
}
