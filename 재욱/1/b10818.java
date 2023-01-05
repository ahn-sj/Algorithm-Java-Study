import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
        int maxNum = 0;
        int minNum = 0;
        int[] bArr = new int[a];
        
        for (int i=0; i<a; i++) {
            bArr[i] = in.nextInt();
        }

        maxNum = bArr[0];
        for (int i : bArr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }

        minNum = bArr[0];
        for (int i : bArr) {
            if (i < minNum) {
                minNum = i;
            }
        }

        System.out.printf("%d %d",minNum, maxNum);
	}
}