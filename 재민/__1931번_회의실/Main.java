package 스터디._7주차.__1931번_회의실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time>{
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Time> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Time(start, end));
        }
        Collections.sort(list);
        int cnt = 0;
        int end = 0;
        for(Time time : list) {
            if(time.start >= end) {
                cnt++;
                end = time.end;
            }
        }
        System.out.println(cnt);
    }
}
