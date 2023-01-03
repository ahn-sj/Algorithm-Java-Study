import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int MAX=-1000000,MIN=1000000;
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            MAX=Math.max(MAX,num);
            MIN=Math.min(MIN,num);
        }
        System.out.println(MIN+" "+MAX);

    }
}