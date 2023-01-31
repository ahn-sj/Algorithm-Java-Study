import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb=new StringBuilder("");
    static void go(int n,int x,int y){
        if(n==1){
            sb.append(x+" "+y+"\n");
            return;
        }
        go(n-1,x,6-x-y);
        sb.append(x+" "+y+"\n");
        go(n-1,6-x-y,y);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        go(n,1,3);
        bw.write(((int)Math.pow(2,n)-1)+"\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
