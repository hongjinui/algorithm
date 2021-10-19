package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 숫자 문자열과 영단어
 *   출    처 : https://programmers.co.kr/learn/courses/30/lessons/81301
 *   문제 유형 :
 *   -----------------------------------------------------------------------------------
 */

public class NumStrNEngWord {

    public static void main(String[] args){

        String s = "sevensixeightonezero";
//        String s = "23four5six7";
//        String s = "2three45seven";
//        String s = "123";
//        String s = "7012953";
        int result = solution(s);
        System.out.println(result);

    }

    public static int solution(String s) {
        String answer = "";
        String temp = "";
        Map<String,Integer> map = new HashMap<>();
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int j=0;j<s.length();j++){

            if("0123456789".indexOf(s.charAt(j)) >= 0){
                answer += s.charAt(j);
            }else{
                temp += s.charAt(j);
                if(map.containsKey(temp)){
                    answer += map.get(temp);
                    temp = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }
}
