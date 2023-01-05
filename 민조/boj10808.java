import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s=br.readLine();
        int[] cnt= new int[130];
        for(int i=0;i<s.length();i++){
            cnt[Character.getNumericValue(s.charAt(i))]++;
        }
        for(char i='a';i<='z';i++){
            bw.write(cnt[Character.getNumericValue(i)]+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}