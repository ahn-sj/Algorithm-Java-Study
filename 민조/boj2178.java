import java.io.*;
import java.util.*;

public class Main {

    static String[] s=new String[101];
    static int[][] c= new int[101][101];
    static int[] dx={0,0,1,-1};
    static int[] dy={1,-1,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs=br.readLine().split(" ");
        int n =Integer.parseInt(inputs[0]);
        int m =Integer.parseInt(inputs[1]);
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            s[i]=br.readLine();
        }
        q.add(new Pair(0,0));
        c[0][0]=1;

        while(!q.isEmpty()){
            Pair now=q.poll();
            for(int i=0;i<4;i++){
                int nx=now.x+dx[i],ny=now.y+dy[i];
                if(nx<0 || nx>=n || ny<0 || ny>=m)continue;
                if(s[nx].charAt(ny)=='1' && c[nx][ny]==0){
                    c[nx][ny]=c[now.x][now.y]+1;
                    q.add(new Pair(nx,ny));
                }
            }
        }
        bw.write(c[n-1][m-1] +"\n");

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

