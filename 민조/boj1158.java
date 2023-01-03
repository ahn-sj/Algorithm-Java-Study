import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++)q.add(i);
        bw.write("<");
        for(int i=1;i<=n;i++){
            for(int j=1;j<m;j++){
                q.add(q.poll());
            }
            if(i==n)bw.write(q.poll()+">\n");
            else bw.write(q.poll()+", ");
        }


        br.close();
        bw.flush();
        bw.close();
    }
}