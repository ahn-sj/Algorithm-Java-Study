package 스터디._7주차._1541번_잃어버린_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");


        int answer = Integer.MAX_VALUE;
        while(st.hasMoreTokens()) {

            int tmp = 0;

            StringTokenizer str = new StringTokenizer(st.nextToken(), "+");

            while(str.hasMoreTokens())
                tmp += Integer.parseInt(str.nextToken());

            if(answer == Integer.MAX_VALUE) answer = tmp;
            else answer -= tmp;
        }
        System.out.println(answer);
    }
}
