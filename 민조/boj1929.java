import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime=new boolean[1000001];
        prime[1]=true;
        for(int i=2;i<1000001;i++){
            if(prime[i]==false){
                for(int j=i*2;j<1000001;j+=i){
                    prime[j]=true;
                }
            }
        }

        String[] input=br.readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);

        for(int i=l;i<=r;i++){
            if(prime[i]==false){
                bw.write(i+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}