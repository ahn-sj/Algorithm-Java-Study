import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] step = new int[100000+1];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(N);
		
		while (queue.size() != 0) {
			
			int cur_pos = queue.poll();
			
			if (cur_pos == K)
				break;
				
			if (0 <= cur_pos-1) {
				if (step[cur_pos-1] == 0) {
					step[cur_pos-1] = step[cur_pos] + 1;
					queue.offer(cur_pos-1);
				}
			}
			if (cur_pos+1 <= 100000) {
				if (step[cur_pos+1] == 0) {
					step[cur_pos+1] = step[cur_pos] + 1;
					queue.offer(cur_pos+1);
				}
			}
			if (cur_pos*2 <= 100000) {
				if (step[cur_pos*2] == 0) {
					step[cur_pos*2] = step[cur_pos] + 1;
					queue.offer(cur_pos*2);
				}
			}
		}
		
		System.out.println(step[K]);
	}
}
