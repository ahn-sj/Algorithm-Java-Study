import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Boolean flag = false;
        int num = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                if (flag) ans -= num;
                else ans += num;
                num = 0;
                continue;
            }
            if (s.charAt(i) == '-') {
                if(flag)ans -= num;
                else ans +=num;
                flag = true;
                num = 0;
                continue;
            }
            num*=10;
            num += (s.charAt(i)-'0');
        }
        if(flag)ans -= num;
        else ans += num;
        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();
    }


}
