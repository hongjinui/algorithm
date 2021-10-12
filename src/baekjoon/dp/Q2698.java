package baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 인접한 비트의 개수
 *   정답 비율 : 75%
 *   출    처 : https://www.acmicpc.net/problem/2698
 *   못풀었다모르겠다
 *   -----------------------------------------------------------------------------------
 */
public class Q2698 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] data = new int[n][2];
        for(int i=0;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<2;j++){
                // 입력받은 데이터 배열
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//
//        int[] dp = new int[n];
//        dp[1] = 1;
//        dp[2] =
//



    }
}
