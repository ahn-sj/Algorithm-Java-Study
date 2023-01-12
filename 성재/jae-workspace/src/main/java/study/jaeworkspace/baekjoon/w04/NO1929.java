package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 소수 구하기
 */
public class NO1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        /**
         * isPrime(), isPrime2()
         */
//        for (int i = start; i <= end; i++) {
//            if(isPrime3(i)) {
//                bw.write(i + "\n");
//            }
//        } // isPrime(), isPrime2() End

        /**
         * isPrime3()
         */
        boolean[] isPrime = new boolean[end + 1];
        Arrays.fill(isPrime, true);

        isPrime3(start, end, isPrime);
        for (int i = start; i <= end; i++) {
            if(isPrime[i]) {
                bw.write(i + "\n");
            }
        } // isPrime3() End

        bw.flush();

        bw.close();
        br.close();
    }

    /**
     * 시간복잡도 O(N logN) 에라토스테네스의 채
     */
    private static void isPrime3(int start, int end, boolean[] isPrime) {
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= end; i++) {
            if(isPrime[i]) {
                for (int j = i; i * j <= end; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
    }

    /**
     * 시간복잡도 O(sqrt(n))
     * 어떤 소수도 N의 제곱근보다 큰 수로 나눠지지 않는다.
     * 예를 들면, 17이 소수인지 확인해보려면 4까지만 확인해보면 된다.
     */
    private static boolean isPrime2(int num) {
        if(num < 1) { return false; }

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 시간복잡도 O(N)
     */
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
