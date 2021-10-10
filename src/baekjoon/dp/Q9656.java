package baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 돌 게임 2
 *   정답 비율 : 79%
 *   -----------------------------------------------------------------------------------
 */
public class Q9656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[1001];


        // 돌이 1개 일 때 상근의 패
        // 돌이 2개 일 때 상근의 승
        // 돌이 3개 일 때 상근의 패
        arr[1] = false;
        arr[2] = true;
        arr[3] = false;

        for(int i=4;i<=n;i++){
            if( !arr[i-1] || !arr[i-3]) arr[i] = true;
            else;
        }







    }
}
