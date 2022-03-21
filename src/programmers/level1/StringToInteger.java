package programmers.level1;

public class StringToInteger {


    public static void main(String[] args){

        String s = "-1234";

        int result = solution(s);

        System.out.println("result = " + result);

    }

    private static int solution(String s){

        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;

    }
}
