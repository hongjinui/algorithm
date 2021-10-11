package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 카드 구매하기
 *   정답 비율 : 60%
 *   출    처 : https://www.acmicpc.net/problem/11052
 *   -----------------------------------------------------------------------------------
 */
public class Q11052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        // 장당 필요한 최대 값을 저장하는 배열
        int[] dp = new int[n+1];
        // 팩 가격
        int[] p = new int[n+1];

        st = new StringTokenizer(br.readLine());
        int k=1;
        while(st.hasMoreTokens()){
            p[k++] = Integer.parseInt(st.nextToken());
        }

        // 만약 4장을 구입한다고 했을 때
        // 1장팩 4개 or 2장팩 2개 or 3장팩 1개 + 1장팩 1개 or 4장팩 1개 할 수 있음
        // 이 경우의 수를 다 비교해서 최대값을 찾아야함
        // 다이나믹 프로그래밍은 작은 문제를 풀고 배열에 저장한 후 다시 사용하는 유형임
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] = Math.max( dp[i], dp[i-j]+p[j] );
            }
        }

        System.out.println(dp[n]);
    }
}
