package _2일차._1406번;

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
				case "L" : //커서 왼쪽으로 옮기면 오른쪾에 값이 생겨서 rt에 그값을 추가
					if(!lt.isEmpty()) rt.push(lt.pop());
					break;						
				case "D" : //커서 오른쪽으로 옮기면 rt값을 lt에 추가(L과 반대)
					if(!rt.isEmpty()) lt.push(rt.pop());
					break;						
				case "B" : //커서 왼쪽에 있는것은 전부 삭제
					if(!lt.isEmpty()) lt.pop();	
					break;
				case "P" :	//커서 왼쪽에 값 추가 						
					lt.push(st.nextToken());
					break;
			}
		}
		
		while(!lt.isEmpty()) rt.push(lt.pop());	//커서 왼쪽 값을 오른쪽에 전부 저장
		while(!rt.isEmpty()) bw.write(rt.pop());
		bw.flush();
	} 

}