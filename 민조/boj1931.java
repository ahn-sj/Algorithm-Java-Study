import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Pair> pa = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] inputs=br.readLine().split(" ");
            int x=Integer.parseInt(inputs[0]);
            int y=Integer.parseInt(inputs[1]);
            pa.add(new Pair(x,y));
        }

        Comparator<Pair> mc = new Comparator<Pair>() {
            @Override
            public int compare(Pair pair, Pair t1) {
                if(pair.y == t1.y){
                    return Integer.compare(pair.x,t1.x);
                }
                return Integer.compare(pair.y,t1.y);
            }
        };

        Collections.sort(pa,mc);
        int ans=1,last=pa.get(0).y;
        for(int i=1;i<n;i++){
            if(pa.get(i).x >= last){
                ans++;
                last=pa.get(i).y;
            }
        }
        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();
    }


}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}