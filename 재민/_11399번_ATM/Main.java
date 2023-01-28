package 스터디._7주차._11399번_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    int index, time;

    public Person(int index, int time) {
        this.index = index;
        this.time = time;
    }

    @Override
    public int compareTo(Person o){
        return this.time - o.time;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(st.nextToken());
            list.add(new Person(i+1, x));
        }
        Collections.sort(list);
        int sum = 0;
        int tmp = 0;
        for(Person x : list) {
            tmp += x.time;
            sum += tmp;
        }
        System.out.println(sum);
    }
}
