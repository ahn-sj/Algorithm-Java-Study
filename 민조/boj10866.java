import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deq=new LinkedList<>();
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            String[] s = br.readLine().split(" ");
            switch(s[0]){
                case "push_front":
                    deq.addFirst(Integer.parseInt(s[1]));
                    break;
                case "push_back":
                    deq.addLast(Integer.parseInt(s[1]));
                    break;
                case "pop_front":
                    if(deq.isEmpty())bw.write("-1\n");
                    else bw.write(deq.pollFirst()+"\n");
                    break;
                case "pop_back":
                    if(deq.isEmpty())bw.write("-1\n");
                    else bw.write(deq.pollLast()+"\n");
                    break;
                case "size":
                    bw.write(deq.size()+"\n");
                    break;
                case "empty":
                    if(deq.isEmpty())bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(deq.isEmpty())bw.write("-1\n");
                    else bw.write(deq.peekFirst()+"\n");
                    break;
                case "back":
                    if(deq.isEmpty())bw.write("-1\n");
                    else bw.write(deq.peekLast()+"\n");
                    break;
            }

            T--;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}