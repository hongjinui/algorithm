package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 점화식
 *   정답 비율 : 75%
 *   출    처 : https://www.acmicpc.net/problem/13699
 *   -----------------------------------------------------------------------------------
 */
public class Q13699 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        //
        long[] dp = new long[n+1];
        dp[0] = 1;

        // n번째 수를 구해야하기때문에 n 번 수행
       for(int i=1;i<=n;i++){
           //
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }

        System.out.println(dp[n]);
    }
}
