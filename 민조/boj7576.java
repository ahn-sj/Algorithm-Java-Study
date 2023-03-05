import java.io.*;
import java.util.*;

public class Main {
    static int[][] a=new int[1001][1001];
    static int[][] c=new int[1001][1001];
    static int[] dx={0,0,1,-1};
    static int[] dy={1,-1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs=br.readLine().split(" ");
        int n = Integer.parseInt(inputs[1]);
        int m = Integer.parseInt(inputs[0]);
        for(int i=0;i<n;i++){
            inputs=br.readLine().split(" ");
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(inputs[j]);
            }
        }
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    c[i][j]=1;
                    q.add(new Pair(i,j));
                }
            }
        }

        while(!q.isEmpty()){
            int x=q.peek().x,y=q.peek().y;
            q.poll();
            for(int i=0;i<4;i++){
                int nx=x+dx[i],ny=y+dy[i];
                if(nx<0 || nx>=n || ny<0 ||ny>=m)continue;
                if(a[nx][ny]==0 && c[nx][ny]==0){
                    c[nx][ny]=c[x][y]+1;
                    q.add(new Pair(nx,ny));
                }
            }
        }
        int ans=1;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j] != -1){
                    if(c[i][j]==0)flag=false;
                    else ans=Math.max(ans,c[i][j]);
                }
            }
        }
        if(flag)bw.write((ans-1)+"");
        else bw.write("-1");

        br.close();
        bw.flush();
        bw.close();


    }


}
class Pair{
    public int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

