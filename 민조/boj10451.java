import java.io.*;
import java.util.*;

public class Main {
    static Boolean[] c = new Boolean[1001];
    static int[] a = new int[1001];

    public static void dfs(int x) {
        c[x] = true;
        if (!c[a[x]]) dfs(a[x]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(inputs[i - 1]);
                c[i] = false;
            }

            int ans=0;
            for(int i=1;i<=n;i++){
                if(!c[i]){
                    ans++;
                    dfs(i);
                }
            }
            bw.write(ans+"\n");
            T--;
        }



        br.close();
        bw.flush();
        bw.close();
    }


}


