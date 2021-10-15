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

//        String s = "one4seveneight";
//        String s = "23four5six7";
        String s = "2three45sixseven";
        int result = solution(s);
        System.out.println(result);

    }

    public static int solution(String s) {
        String answer = "";
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        // hashMap에 영단어 수 배열 put
        Map<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            hashMap.put(arr[i],i);
        }

        // 영어만 남기기
        String engNums = s.replaceAll("[^a-z]*","");
        StringBuilder engNumsSb = new StringBuilder(engNums);
        // 수만 남기기
        String nums = s.replaceAll("[^0-9]]*","");
        StringBuilder numsSb = new StringBuilder(nums);

        while(engNumsSb.length() != 0){
            System.out.println(engNumsSb + "  @@@legnt");
            // 영단어 문자열의 첫 번째가 z 일 때는 zero 1가지 경우
            if( engNumsSb.length() > 0 && toString(engNumsSb.charAt(0)).equals("z")){
                System.out.println("zero");
                engNumsSb.delete(0,4);
                numsSb.append(hashMap.get("zero"));
            }
            // 영단어 문자열의 첫 번째가 o 일 때는 one 1가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("o")){
                System.out.println("one");
                engNumsSb.delete(0,3);
                numsSb.append(hashMap.get("one"));
            }
            // 영단어 문자열의 첫 번째가 e 일 때는 eight 1가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("e")){
                System.out.println("eight");
                engNumsSb.delete(0,5);
                numsSb.append(hashMap.get("eight"));
            }
            // 영단어 문자열의 첫 번째가 n 일 때는 nine 1가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("n")){
                System.out.println("nine");
                engNumsSb.delete(0,4);
                numsSb.append(hashMap.get("nine"));
            }
            // 영단어 문자열의 첫 번째가 t 일 때는 two, three 2가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("n")){
                System.out.println("#####");
                if(engNumsSb.substring(0,3).equals("two")){
                    System.out.println("two");
                    engNumsSb.delete(0,3);
                    numsSb.append(hashMap.get("two"));
                }else{
                    System.out.println("three");
                    engNumsSb.delete(0,5);
                    numsSb.append(hashMap.get("three"));
                }
            }
            // 영단어 문자열의 첫 번째가 f 일 때는 four, five 2가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("f")){
                if(engNumsSb.substring(0,2).equals("fo")){
                    System.out.println("four");
                    numsSb.append(hashMap.get("four"));
                }else{
                    System.out.println("five");
                    numsSb.append(hashMap.get("five"));
                }
                engNumsSb.delete(0,4);
            }
            // 영단어 문자열의 첫 번째가 s 일 때는 six, seven 2가지 경우
            if(engNumsSb.length() > 0 &&toString(engNumsSb.charAt(0)).equals("s")){
                if(engNumsSb.substring(0,3).equals("six")){
                    System.out.println("six");
                    engNumsSb.delete(0,3);
                    numsSb.append(hashMap.get("six"));
                }else{
                    System.out.println("seven");
                    engNumsSb.delete(0,5);
                    numsSb.append(hashMap.get("seven"));
                }
            }

        }

        String[] arr2 = new String[numsSb.length()];
        for(int j=0;j<numsSb.length();j++){
            arr2[j] = toString(numsSb.charAt(j));
        }
        Arrays.sort(arr2);

        for(String n : arr2){
            answer += n;
        }

        return Integer.parseInt(answer);
    }

    private static String toString(char c) {

        return Character.toString(c);

    }
}
