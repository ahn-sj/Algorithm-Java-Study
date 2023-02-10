import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    // 자바의 지역변수 메모리 크기와 전역변수 메모리크기는 어떻게 되는가 ?
    static int[] d=new int[200001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n,k;
        String[] inputs=br.readLine().split(" ");
        n=Integer.parseInt(inputs[0]);
        k=Integer.parseInt(inputs[1]);

        Queue<Integer> q=new LinkedList<>();
        d[n]=1;
        q.add(n);
        while(!q.isEmpty()){
            int x=q.poll();
            if(x+1 <= 200000){
                if(d[x+1]==0){
                    d[x+1]=d[x]+1;
                    q.add(x+1);
                }
            }
            if(x-1 >=0 ){
                if(d[x-1]==0){
                    d[x-1]=d[x]+1;
                    q.add(x-1);
                }
            }
            if(x*2 <= 200000){
                if(d[x*2]==0){
                    d[x*2]=d[x]+1;
                    q.add(x*2);
                }
            }
        }
        bw.write((d[k]-1)+"");

        br.close();
        bw.flush();
        bw.close();

    }


}
