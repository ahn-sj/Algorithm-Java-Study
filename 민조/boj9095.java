import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] d = new int[11];
        d[0]=1;
        d[1]=1;
        d[2]=2;
        for(int i=3;i<=10;i++){
            d[i]=d[i-1]+d[i-2]+d[i-3];
        }
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            int n = Integer.parseInt(br.readLine());
            bw.write(d[n]+"\n");
            T--;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}