package basic;

import java.util.Scanner;

public class Greedy {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        result += n / 500;
        System.out.println("500 : " +  n / 500);
        n = n % 500;

        result += n / 100;
        System.out.println("100 : " +  n / 100);
        n = n % 100;

        result += n / 50;
        System.out.println("50 : " +  n / 50);
        n = n % 50;

        result += n / 10;
        System.out.println("10 : " +  n / 10);
//        n = n % 10;

        System.out.println(result);


    }
}
