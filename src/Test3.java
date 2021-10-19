import java.util.HashSet;
import java.util.Set;

public class Test3 {

    public static void main(String[] args){
//        int[] arr = {1, 2, 3, 4};
        int[] arr = {1,2,7,6,4};
        int answer = solution(arr);
        System.out.println(answer);
    }

    static void comb(int[] arr, boolean[] visited, int depth, int n, int r,Set<Integer> set) {
        int temp = 0;

        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    temp += arr[i];
                }
            }
            set.add(temp);
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1,set);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r,set);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        boolean[] visited = new boolean[nums.length];
        boolean isNotPrime = false;

        // n개 중 3개의 값을 뽑아 더한 수를 담는 set
        Set<Integer> set = new HashSet<>();

        comb(nums,visited,0,nums.length,3,set);

        for(int num : set){
            // isNotPrime 초기화
            isNotPrime = false;
            // 2부터 자신-1 까지 나누어 지는 값 있는지
            for(int i=2;i<num; i++){
                if( num % i == 0 ) {
                    isNotPrime = true;
                }
            }
            // isNotPrime이 false면 소수
            if( !isNotPrime ) answer++;
        }

        return answer;
    }
}
