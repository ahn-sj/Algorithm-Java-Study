package study.jaeworkspace.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 요세푸드 문제
 */
public class NO1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = scan.nextInt();
        int gap = scan.nextInt();

        int[] removedPeopleOrder = new int[peopleCount];
        List<Integer> peoples = new ArrayList<>();

        int index = 0;

        for (int i = 1; i <= peopleCount; i++) {
//            peoples[i] = i;
            peoples.add(i);
        }

        System.out.println(peoples);

        int removeCount = 0;
        int arrayIndex = 0;

        while (peoples.size() != 0) {
            arrayIndex = index + gap - 1;
            if(arrayIndex > peoples.size()) {
                arrayIndex = (arrayIndex) % peoples.size();

                System.out.println(index);
            }

            removedPeopleOrder[removeCount] = peoples.remove(arrayIndex);
            removeCount++;

            index = arrayIndex;
            System.out.println(peoples.size());
            System.out.println("peoples = " + peoples);
            System.out.println("removedPeopleOrder = " + Arrays.toString(removedPeopleOrder));
        }
        String array = Arrays.toString(removedPeopleOrder);
        System.out.println("<" + array.substring(1, array.length()-1) + ">");
    }
}
