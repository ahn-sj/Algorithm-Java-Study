import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a= new int[11];
        String[] inputs= br.readLine().split(" ");
        int n=Integer.parseInt(inputs[0]);
        int m =Integer.parseInt(inputs[1]);
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        int ans=0;
        for(int i=n;i>0;i--){
            int div = m/a[i];
            ans+=div;
            m -= div*a[i];
        }
        bw.write(ans+"\n");




        br.close();
        bw.flush();
        bw.close();
    }


}
