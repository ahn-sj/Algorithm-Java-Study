import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static int[][] a = new int[2200][2200];
    static int[] cnt= new int[3];
    static void go(int x,int y,int n){
        Boolean flag=true;
        for(int i=x;i<x+n;i++){
            for(int j=y;j<y+n;j++){
                if(a[i][j] != a[x][y]){
                    flag=false;
                    break;
                }
            }
            if(flag==false)break;
        }
        if(flag)cnt[a[x][y]+1]++;
        else {
            int n3=n/3;
            go(x,y,n3);
            go(x+n3,y,n3);
            go(x,y+n3,n3);
            go(x+n3,y+n3,n3);
            go(x+n3*2,y,n3);
            go(x,y+n3*2,n3);
            go(x+n3,y+n3*2,n3);
            go(x+n3*2,y+n3,n3);
            go(x+n3*2,y+n3*2,n3);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String[] inputs=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                a[i][j] = Integer.parseInt(inputs[j]);
            }

        }

        for(int i=0;i<3;i++)cnt[i]=0;
        go(0,0,n);
        for(int i=0;i<3;i++)bw.write(cnt[i]+"\n");

        bw.flush();
        br.close();
        bw.close();

    }


}
