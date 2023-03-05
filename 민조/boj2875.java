import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs=br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);

        int team=Math.min(n/2,m);
        int nm=n+m;
        nm -= team*3;
        k -= nm;
        if(k > 0){
            int div=k/3;
            if(k%3 > 0)div++;
            team-= div;
        }
        bw.write(team+"");

        br.close();
        bw.flush();
        bw.close();
    }


}
