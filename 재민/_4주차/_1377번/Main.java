package _4주차._1377번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Bubble [] arr= new Bubble[n];
        
        for(int i=0; i<n; i++) {
        	int value = Integer.parseInt(br.readLine());
        	int index = i;
            arr[i] = new Bubble(value, index);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<n; i++) {
            if(max < arr[i].index - i)
                max = arr[i].index - i;
        }
        
        System.out.println(max+1);
    }
}
class Bubble implements Comparable<Bubble>{
    int value;
    int index;   
    
    public Bubble(int value, int index) {
		this.value = value;
		this.index = index;
	}

	@Override
    public int compareTo(Bubble o) {
        return this.value - o.value;	//내림차순 정렬
    }
}
