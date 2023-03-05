import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    static Boolean[] check = new Boolean[10];
    static int isPossible(int n){
        if(n==0){
            if(check[0])return 0;
            else return 1;
        }
        int len=0;
        while(n>0){
            if(check[n%10]) return 0;
            len++;
            n/=10;
        }
        return len;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<10;i++)check[i]=false;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(m>0) {
            String[] inputs = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                check[Integer.parseInt(inputs[i])] = true;
            }
        }
        int ans=Math.abs(n-100);
        for(int i=0;i<1000001;i++){
            int len=isPossible(i);
            if(len>0){
                ans=Math.min(ans,len+Math.abs(n-i));
            }
        }
        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();

    }


}
