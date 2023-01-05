import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s= br.readLine();
        String[] s2 = new String[s.length()];
        for(int i=0;i<s.length();i++){
            s2[i]=s.substring(i);
        }
        Arrays.sort(s2);
        for(int i=0;i<s.length();i++){
            bw.write(s2[i]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}