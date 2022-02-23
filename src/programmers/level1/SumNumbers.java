package programmers.level1;

public class SumNumbers {

    public static void main(String[] args){

        int[] numbers = {1,2,3,4,6,7,8,0};
        int result = solution(numbers);

        System.out.println(result);

    }

    public static int solution(int[] numbers){

        int num = 9;
        int sumOneToNine = 0;   // 1~9 합
        int sumListNums = 0;

        for(int i=1; i<=num; i++){
            sumOneToNine = sumOneToNine + i;
        }

        for(int i=0; i<numbers.length; i++){
            sumListNums = sumListNums + numbers[i];
        }

        return sumOneToNine - sumListNums;

    }
}
