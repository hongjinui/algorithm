package basic;

public class DpFibonacci2 {

    static int[] arr = new int[100];

    // 피보나치 수열
    // 동적 프로그래밍의 핵심은 한 번 푼 문제 다시 풀지 않는다. 배열(테이블)에 저장하고 필요할 때 사용한다.
    public static void main(String[] args){

        System.out.println(dp(50));
    }

    public static int dp(int n) {

        if(n==1) return 1;
        if(n==2) return 1;
        if(arr[n] != 0 ) return arr[n];
        return arr[n] = dp(n-1) + dp(n-2);
    }
}
