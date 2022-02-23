package programmers.level1;

public class SumPlusMinus {


    public static void main(String[] args){

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int result = solution(absolutes, signs);

        System.out.println(result);

    }

    public static int solution(int[] absolutes, boolean[] signs){

        int plus = 0;
        int minus = 0;

        for( int i=0; i<signs.length; i++ ){
            boolean sign = signs[i];

            if( sign ) plus = plus + absolutes[i];
            else minus = minus + absolutes[i];
        }

        return plus - minus;

    }


    /**
     *  지렸다
     *  int answer = 0;
     *  for (int i=0; i<signs.length; i++)
     *  answer += absolutes[i] * (signs[i]? 1: -1);
     *  return answer;
     *
     */
}
