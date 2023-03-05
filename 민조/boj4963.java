import java.io.*;
import java.util.*;

public class Main {
    static int[][] a = new int[51][51];
    static int[] dx={0,0,1,-1,-1,-1,1,1};
    static int[] dy={1,-1,0,0,-1,1,1,-1};
    static Boolean[][] c=new Boolean[51][51];
    static int n,m;
    public static void dfs(int x,int y){
        c[x][y]=true;
        for(int i=0;i<8;i++){
            int nx=x+dx[i],ny=y+dy[i];
            if(nx<0 || nx >=n || ny<0 || ny>=m)continue;
            if(a[nx][ny]==1 && c[nx][ny]==false){
                dfs(nx,ny);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] inputs=br.readLine().split(" ");
            m = Integer.parseInt(inputs[0]);
            n = Integer.parseInt(inputs[1]);
            if(n==0 && m==0)break;
            for(int i=0;i<n;i++){
                inputs=br.readLine().split(" ");
                for(int j=0;j<m;j++) {
                    a[i][j] = inputs[j].charAt(0) - '0';
                    c[i][j]=false;
                }
            }
            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]==1 && c[i][j]==false){
                        dfs(i,j);
                        ans++;
                    }
                }
            }

            bw.write(ans+"\n");


        }

        br.close();
        bw.flush();
        bw.close();


    }


}


