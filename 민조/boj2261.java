import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    static ArrayList<Pos> a=new ArrayList<>();
    static int dist(Pos p1,Pos p2){
        return (p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y);
    }
    static Comparator<Pos> xc=new Comparator<Pos>() {
        @Override
        public int compare(Pos pos, Pos t1) {
            return Integer.compare(pos.x,t1.x);
        }
    };
    static Comparator<Pos> yc=new Comparator<Pos>() {
        @Override
        public int compare(Pos pos, Pos t1) {
            return Integer.compare(pos.y,t1.y);
        }
    };
    static int go(int x,int y){
        if(y-x < 3){
            int temp=2000000000;
            for(int i=x;i<y;i++){
                for(int j=i+1;j<=y;j++){
                    temp=Math.min(temp,dist(a.get(i),a.get(j)));
                }
            }
            return temp;
        }

        int mid=(x+y)/2;
        int l=go(x,mid);
        int r=go(mid+1,y);
        int ans = Math.min(l,r);
        ArrayList<Pos> v=new ArrayList<>();
        for(int i=x;i<=y;i++){
            int d= a.get(mid).x- a.get(i).x;
            if(d*d < ans)v.add(a.get(i));
        }
        Collections.sort(v,yc);
        for(int i=0;i<v.size();i++){
            for(int j=i+1;j<v.size();j++){
                int d2 = v.get(j).y - v.get(i).y;
                if(d2*d2 < ans){
                    ans = Math.min(ans,dist(v.get(i),v.get(j)));
                }
                else break;
            }
        }
        return ans;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] inputs=br.readLine().split(" ");
            a.add(new Pos(Integer.parseInt(inputs[0]),Integer.parseInt(inputs[1])));
        }
        Collections.sort(a,xc);
        bw.write(go(0,n-1)+"");


        bw.flush();
        br.close();
        bw.close();

    }


}
class Pos{
    int x,y;
    Pos(int x,int y){
        this.x=x;
        this.y=y;
    }
}