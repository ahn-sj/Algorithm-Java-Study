package _4주차._10825번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class Student{
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, kor, eng, math));
        }

        Collections.sort(list, new Comparator<Student>() {
        	
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.kor == o2.kor) {	// 1. 국어 점수가 같고
                    if (o1.eng == o2.eng) {	// 2. 영어 점수도 같으면
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);	// 모두 같을 경우 사전순으로 증가
                        }
                        return o2.math - o1.math;	// 3. 수학 점수가 감소한다. [ 비교 객체 - 자기 자신 = (내림차순) ]
                    }
                    return o1.eng - o2.eng;	//국어점수는 같은데 다른 점수는 같지 않을경우 [ 자기 자신 - 비교 객체 = (오름차순) ]
                }
                return o2.kor - o1.kor;	// 모두 다를경우 국어 점수가 감소하는 순서 [ 비교객체 - 자기자신 = (내림차순) ]
            }
            
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : list) sb.append(student.name + '\n');

        System.out.println(sb);

    }
}