package programmers.level2;

public class TernaryReverse {

    public static void main(String[] args){

        int n = 125;
        int result = 229;

        int answer = solution(n);

        System.out.println("answer = " + answer);
    }

    public static int solution(int n){

        int answer = 0;

        StringBuilder sb = new StringBuilder();

        while(true){
            // 10진법 -> 앞뒤 반접 3진법
            if( n < 3 ){
                sb.append(n+"");
                break;
            }else{
                sb.append(n%3+"");
                n = n/3;
            }
        }

        String[] strArr = sb.toString().split("");
        for(int i=0; i<strArr.length; i++){
            answer += Integer.parseInt(strArr[i]) * Math.pow(3, strArr.length-i-1);
        }


        return answer;


    }

}
