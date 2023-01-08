package _2����._1406��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		Stack<String> lt = new Stack<>();
		Stack<String> rt = new Stack<>();
		
		for(int i=0; i<str.length(); i++) lt.push(str.substring(i, i+1));

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
				case "L" : //Ŀ�� �������� �ű�� �����U�� ���� ���ܼ� rt�� �װ��� �߰�
					if(!lt.isEmpty()) rt.push(lt.pop());
					break;						
				case "D" : //Ŀ�� ���������� �ű�� rt���� lt�� �߰�(L�� �ݴ�)
					if(!rt.isEmpty()) lt.push(rt.pop());
					break;						
				case "B" : //Ŀ�� ���ʿ� �ִ°��� ���� ����
					if(!lt.isEmpty()) lt.pop();	
					break;
				case "P" :	//Ŀ�� ���ʿ� �� �߰� 						
					lt.push(st.nextToken());
					break;
			}
		}
		
		while(!lt.isEmpty()) rt.push(lt.pop());	//Ŀ�� ���� ���� �����ʿ� ���� ����
		while(!rt.isEmpty()) bw.write(rt.pop());
		bw.flush();
	} 

}