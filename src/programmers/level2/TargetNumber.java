package programmers.level2;

public class TargetNumber {

    public static void main(String[] args){

        int[] numbers = {1,1,1,1,1};
        int target = 3;


        int result = solution(numbers, target);

        System.out.println(result);

    }

    private static int solution(int[] numbers, int target){

        return dfs(numbers, target, 0, 0);
    }

    private static int dfs(int[] numbers, int target, int depth, int sum){

        int cnt = 0;

        if( depth == numbers.length ){
            if( target == sum ){
                return 1;
            }
            return 0;
        }

        cnt += dfs(numbers, target, depth+1, sum + numbers[depth]);
        cnt += dfs(numbers, target, depth+1, sum - numbers[depth]);

        return cnt;

    }


}
