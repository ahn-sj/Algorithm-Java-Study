import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> a= new ArrayList<>(n);

        String[] inputs=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a.add(Long.parseLong(inputs[i]));
        }
        Collections.sort(a);
        long ans=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=a.get(i);
            ans+=sum;
        }
        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();
    }


}
