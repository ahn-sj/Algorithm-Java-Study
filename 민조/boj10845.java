import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last=-1;
        while(T>0){
            String[] s=br.readLine().split(" ");
            switch(s[0]){
                case "push":
                    q.add(Integer.parseInt(s[1]));
                    last=Integer.parseInt(s[1]);
                    break;
                case "pop":
                    if(q.isEmpty())bw.write("-1\n");
                    else bw.write(q.poll()+"\n");
                    break;
                case "size":
                    bw.write(q.size()+"\n");
                    break;
                case "empty":
                    if(q.isEmpty())bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(q.isEmpty())bw.write("-1\n");
                    else bw.write(q.peek()+"\n");
                    break;
                case "back":
                    if(q.isEmpty())bw.write("-1\n");
                    else bw.write(last+"\n");
                    break;
            }
            T--;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}