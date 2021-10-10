package baekjoon.greedy;

import java.io.*;

/*
*   -----------------------------------------------------------------------------------
*   문제 제목 : 세탁소 사장 동혁
*   정답 비율 : 78%
*   -----------------------------------------------------------------------------------
 */

public class Q2070 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int temp;

        for(int i=0;i<testCase;i++){

            int quarter, dime, nickel, penny;
            temp = Integer.parseInt(br.readLine());

            quarter = temp/25;
            temp = temp%25;

            dime = temp/10;
            temp = temp%10;

            nickel = temp/5;
            temp = temp%5;

            penny = temp;

            bw.write(quarter + " " + dime + " " + nickel + " " + penny );
            bw.newLine();
        }

        bw.flush();
        bw.close();

        /*
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
        }*/
    }
}
