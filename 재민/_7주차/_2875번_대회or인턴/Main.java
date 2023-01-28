package 스터디._7주차._2875번_대회or인턴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int min = Math.min(N / 2, M);   //제일 작은값이 만들 수 있는 팀 개수
        while(true){
            if (M + N - 3 * min >= K) break;
            min -= 1;
        }

        System.out.println(min);
    }
}