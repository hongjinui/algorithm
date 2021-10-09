package baekjoon.greedy;

import java.util.Scanner;

/*
*   -----------------------------------------------------------------------------------
*   문제 제목 : 세탁소 사장 동혁
*   정답 비율 : 78%
*   -----------------------------------------------------------------------------------
 */
// 세탁소 거스름 문제
public class Q2070 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        int[] arr = new int[testCase];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int quarter, dime, nickel, penny;
            quarter = arr[i]/25;
            arr[i] = arr[i]%25;

            dime = arr[i]/10;
            arr[i] = arr[i]%10;

            nickel = arr[i]/5;
            arr[i] = arr[i]%5;

            penny = arr[i];
            arr[i] = arr[i];

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
