package basic;

public class DpFibonacci {

    // 해결한 문제의 답을 저장해 놓는 배열(테이블)
    static int[] arr = new int[100];

    public static void main(String[] args) {

        System.out.println(dp(40));

    }

    public static int dp(int n){
        // 피보나치 수열은 1,2 번 째 수는 1임
        if(n == 1) return 1;
        if(n == 2) return 1;

        // n 번째 값이 0이 아니면 - 문제를 해결 했다면 값 반환
        if(arr[n] != 0) return arr[n];

        // 값을 저장하면서 반환
        return arr[n] = dp(n-1) + dp(n -2 );

    }
}
