import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long a=Long.parseLong(input[0]);
        long b=Long.parseLong(input[1]);

        long g =gcd(a,b);

        bw.write(g+ " "+ (a*b)/g);

        br.close();
        bw.flush();
        bw.close();
    }

    public static long gcd(long a,long b){
        while(b>0){
            a%=b;
            long temp=b;
            b=a;
            a=temp;
        }
        return a;
    }

}