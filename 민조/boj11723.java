import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int ans=0,full=(1<<20)-1;
        while(T>0){
            String[] inputs=br.readLine().split(" ");
            int x=0;
            if(inputs[0].equals("add")){
                x=Integer.parseInt(inputs[1]) -1;
                ans |= (1<<x);
            }
            else if(inputs[0].equals("remove")){
                x=Integer.parseInt(inputs[1]) -1;
                ans &= ~(1<<x);
            }
            else if(inputs[0].equals("check")){
                x=Integer.parseInt(inputs[1]) -1;
                if((ans & (1<<x))>0)bw.write("1\n");
                else bw.write("0\n");
            }
            else if (inputs[0].equals("toggle")) {
                x=Integer.parseInt(inputs[1]) -1;
                ans ^= (1<<x);
            }
            else if(inputs[0].equals("all")){
                ans=(1<<20)-1;
            }
            else{
                ans=0;
            }

            T--;
        }

        br.close();
        bw.flush();
        bw.close();

    }


}
