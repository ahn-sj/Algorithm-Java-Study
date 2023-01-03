import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Stack<Integer> st=new Stack<>();

        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            else{
                int idx =st.pop();
                if(idx==i-1)ans += st.size();
                else ans++;
            }
        }
        bw.write(ans+"");
        br.close();
        bw.flush();
        bw.close();
    }
}