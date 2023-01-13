package _4주차._11005번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        
        //55를 더하면 대문자가됨
        while(n != 0){
            if(n%b >= 10) sb.append((char) ((n % b) + 55));	//나머지가 10이상이면 대문자로 표현
            else sb.append(n%b);	//아닐경우 그냥 출력
            n /= b;
        }

        System.out.println(sb.reverse().toString());
    }
}