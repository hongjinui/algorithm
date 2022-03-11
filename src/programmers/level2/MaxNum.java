package programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxNum {


    public static void main(String[] args){

        int[] numbers = {9,98,999,99,9};

        String result = solution(numbers);


    }

    public static String solution(int[] numbers){

        String answer = "";
        String[] temp = new String[numbers.length];

        // 문자열로 변경
        for( int i=0; i<numbers.length; i++){
            temp[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(temp, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if( temp[0].equals("0") ) return "0";

        for( String s : temp ){
            answer += s;
        }

        return answer;

    }
}
