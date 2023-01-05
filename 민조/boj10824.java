import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        bw.write(String.valueOf(Long.parseLong(s[0]+s[1]) +
                Long.parseLong(s[2]+s[3])));
        br.close();
        bw.flush();
        bw.close();
    }
}