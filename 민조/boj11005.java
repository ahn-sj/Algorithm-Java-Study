import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a=Integer.parseInt(input[0]);
        int b=Integer.parseInt(input[1]);

        Vector<Integer> v= new Vector<Integer>();

        while(a>0){
            v.add(a%b);
            a/=b;
        }
        for(int i = v.size()-1;i>=0;i--){
            int num=0;
            if(v.get(i)<10){
                num = v.get(i)+'0';
            }
            else{
                num = v.get(i)-10+'A';
            }
            bw.write((char)num);
        }

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