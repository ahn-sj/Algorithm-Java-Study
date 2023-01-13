package _4����._11005��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        
        //55�� ���ϸ� �빮�ڰ���
        while(n != 0){
            if(n%b >= 10) sb.append((char) ((n % b) + 55));	//�������� 10�̻��̸� �빮�ڷ� ǥ��
            else sb.append(n%b);	//�ƴҰ�� �׳� ���
            n /= b;
        }

        System.out.println(sb.reverse().toString());
    }
}