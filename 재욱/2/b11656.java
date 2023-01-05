import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int strLength = str.length();
        String[] strArr = new String[strLength];

        for (int i = 0; i < strLength; i++) {
            strArr[i] = str.substring(i, strLength);
        }

        Arrays.sort(strArr);

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
