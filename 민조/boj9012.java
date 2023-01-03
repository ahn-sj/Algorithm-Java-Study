import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T= Integer.parseInt(br.readLine());
        Stack<Integer> st=new Stack<>();
        while(T>0){
            while(!st.isEmpty()){
                st.pop();
            }
            boolean flag=true;
            String s=br.readLine();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(')st.push(i);
                else {
                    if(st.isEmpty()){
                        flag=false;
                        break;
                    }
                    st.pop();
                }
            }
            if(!st.isEmpty() || !flag) bw.write("NO\n");
            else bw.write("YES\n");
            T--;
        }
        br.close();
        bw.flush();
        bw.close();

    }
}