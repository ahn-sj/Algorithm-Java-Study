import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        A[] a=new A[n];

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            a[i]=new A(num,i);
        }

        Comparator<A> mc=new Comparator<A>(){
            @Override
            public int compare(A a1,A a2){
                if(a1.num > a2.num)return 1;
                else if(a1.num == a2.num){
                    if(a1.idx>a2.idx)return 1;
                }
                return -1;
            }
        };
        Arrays.sort(a,mc);
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,a[i].idx-i);
        }
        bw.write((ans+1)+"");

        br.close();
        bw.flush();
        bw.close();
    }


}

class A{
    int num;
    int idx;
    A(int num,int idx){
        this.num=num;
        this.idx=idx;
    }
}
