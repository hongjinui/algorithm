package baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 돌 게임
 *   정답 비율 : 76%
 *   출    처 : https://www.acmicpc.net/problem/9655
 *   -----------------------------------------------------------------------------------
 */
public class Q9655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
//        boolean[] arr = new boolean[n+1];

        // true는 상근 승, false는 창영승
//        arr[1] = true;
//        arr[2] = false;
//        arr[3] = true;
//        arr[4] = false;

        if(n%2==0) System.out.println("CY");
        else System.out.println("SK");



    }

}
