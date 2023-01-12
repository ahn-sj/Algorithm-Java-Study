package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class NO10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        Queue<Student> q = new PriorityQueue<>();

        int students = Integer.parseInt(br.readLine());

        for (int i = 0; i < students; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String studentName = st.nextToken();
            int ko = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            q.add(new Student(studentName, ko, en, math));
        }

        while (hasElement(q)) {
            Student student = q.poll();
            sb.append(student.name).append("\n");
        }
        bw.write(sb + "");
        bw.flush();
    }

    private static boolean hasElement(Queue<Student> q) {
        return !q.isEmpty();
    }

    static class Student implements Comparable<Student> {

        private String name;
        private int ko;
        private int en;
        private int math;

        public Student(String name, int ko, int en, int math) {
            this.name = name;
            this.ko = ko;
            this.en = en;
            this.math = math;
        }

        @Override
        public int compareTo(Student student) {
            if(ko == student.ko) { // 국어 점수가 같은가
                if(en == student.en) { // 국어 점수와 영어 점수가 같은가
                    if(math == student.math) { // 국어, 영어, 수학 점수가 같은가
                        return name.compareTo(student.name);
                    }
                    return student.math - math;
                }
                return en - student.en;
            }
            return student.ko - ko;
        }
    }

}

