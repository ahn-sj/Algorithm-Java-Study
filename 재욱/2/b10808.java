import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] alArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 97;
            alArr[a]++;
        }

        for (int x : alArr) {
            System.out.print(x + " ");
        }
    }
}