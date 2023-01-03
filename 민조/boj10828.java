import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] commands = br.readLine().split(" ");
            switch(commands[0]){
                case "push":
                    st.push(Integer.parseInt(commands[1]));
                    break;
                case "pop":
                    if(st.isEmpty())bw.write("-1\n");
                    else bw.write(st.pop()+"\n");
                    break;
                case "size":
                    bw.write(st.size()+"\n");
                    break;
                case "empty":
                    if(st.isEmpty())bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "top":
                    if(st.isEmpty())bw.write("-1\n");
                    else bw.write(st.peek()+"\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}